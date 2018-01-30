package objects;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTMatcher;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTVisitor;

public class ASTNodeOrNodeList 
{
	@Override
	public String toString() {
		if (isNodeList)
		{
			return list.toString();
		}
		else if (isASTNode)
		{
			return node.toString();
		}
		else
		{
			return super.toString();
		}
	}
	
	public int toInt() {
		if (isNodeList)
		{
			return list.size();
		}
		else
		{
			return node == null ? 0 : 1;		
		}
	}

	public boolean isNodeList;
	public boolean isASTNode;
	
	public ASTNode node;
	public List list;
	public ASTNodeOrNodeList listParent;
	
	public boolean hasParent()
	{
		if (isNodeList)
		{
			if (listParent != null)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			if (node == null || node.getParent() == null)
			{
				return false;				
			}
			else
			{
				return true;
			}
		}
	}
	
	public ASTNodeOrNodeList getParent()
	{
		if (isNodeList)
		{
			return listParent;
		}
		else // ASTNode
		{
			if (node == null)
			{
				// put some code here so I can place a breakpoint
				int it = 12345;
				it = it + 1;
			}
			return new ASTNodeOrNodeList(node.getParent());
		}
	}
	
	public ASTNodeOrNodeList getRoot()
	{		
		if (isNodeList)
		{
			if (listParent != null)
			{
				return listParent.getRoot();
			}
			else
			{
				return this;
			}
		}
		else // isASTNode
		{
			return new ASTNodeOrNodeList(node.getRoot());
		}
	}
	
	public boolean equals(ASTNodeOrNodeList a2)
	{
		if (isNodeList && a2.isNodeList)
		{
			if (list.equals(a2.list))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else if (isASTNode && a2.isASTNode)
		{
			if (node.equals(a2.node))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}
	
	public ASTNodeOrNodeList(ASTNode node)
	{
		this.node = node;
		list = null;
		isNodeList = false;
		isASTNode = true;
	}
		
	public ASTNodeOrNodeList(List list, ASTNodeOrNodeList parent)
	{
		node = null;
		this.list = list;
		listParent = parent;
		isNodeList = true;
		isASTNode = false;		
	}

	public int getStartPosition() {
		if (isNodeList)
		{
			if (listParent != null)
			{
				return listParent.getStartPosition();
			}
			else
			{
				return 0;
			}
		}
		else // isASTNode
		{
			return node.getStartPosition();
		}
	}

	public ASTNodeOrNodeList getAsList() {
		ASTNodeOrNodeList listRet;
		if (!this.isNodeList)
		{
			List nodeList = new ArrayList ();
			nodeList.add(node);
			listRet = new ASTNodeOrNodeList(nodeList, this.getParent());
		}
		else
		{
			listRet = this;
		}
		return listRet;
	}
}
