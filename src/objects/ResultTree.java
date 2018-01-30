package objects;

import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.CompilationUnit;

public class ResultTree extends FileTree {
	
	public ASTNodeOrNodeList root;
	public ASTNodeOrNodeList operandRoot;
	public ASTNodeOrNodeList parentTree;
		
	public ResultTree(ASTNode root)
	{
		this.root = new ASTNodeOrNodeList(root);
		this.parentTree = null;
	}
	
	public ResultTree(ASTNodeOrNodeList root)
	{
		this.root = root;
		this.parentTree = null;
	}
	
	public ResultTree(ASTNode root, ASTNode operandRoot)
	{
		this.root = new ASTNodeOrNodeList(root);
		this.operandRoot = new ASTNodeOrNodeList(operandRoot);
		this.parentTree = null;
	}
	
	public ResultTree(ASTNodeOrNodeList root, ASTNodeOrNodeList operandRoot)
	{
		this.root = root;
		this.operandRoot = operandRoot;
		this.parentTree = null;
	}
	
	public ResultTree(ResultTree r)
	{
		if (r != null)
		{
			this.root = r.root;
			this.operandRoot = r.operandRoot;
			this.parentTree = r.parentTree;
		}
		else
		{
			root = null;
			operandRoot = null;
			this.parentTree = null;
		}
	}

	public ResultTree(ASTNode root, FileTree originTree)
	{
		this.root =  new ASTNodeOrNodeList(root);
		super.origin = originTree.origin;
		super.project = originTree.project;
		this.parentTree = null;
	}
	
	public ResultTree(ASTNode root, ResultTree originTree)
	{
		this.root =  new ASTNodeOrNodeList(root);
		super.origin = originTree.origin;
		super.project = originTree.project;
		this.parentTree = null;
	}
	
	public String PrintTree()
	{
		return super.project + "\n" + super.origin.toString().split("ProjectSource\\\\")[1] + "\n\n" + root.toString();
	}
	
	public void saveTree()
	{
		// write to file
	}
	
	public ASTNodeOrNodeList getRoot()
	{
		if (this.root == null)
		{
			//read from file
		}
		
		return this.root;
	}
	
	public static int depth(ResultTree t)
	{
		return depthBetween(null, t);
	}
	
	public static int depthBetween(ResultTree ancestor, ResultTree descendent)
	{
		return depthBetween(ancestor.root, descendent.root);
	}
	
	public static int depth(ASTNode t)
	{
		return depthBetween(null, new ASTNodeOrNodeList(t));		
	}

	public static int depth(ASTNodeOrNodeList t)
	{
		return depthBetween(null, t);		
	}
	
	public static int depthBetween(ASTNodeOrNodeList ancestor, ASTNodeOrNodeList descendent)
	{
		int depth = 0;
		ASTNodeOrNodeList currentNode = descendent;
		
		while (currentNode != null && !currentNode.equals(ancestor))
		{
			currentNode = currentNode.getParent();
			depth++;
		}
			
		return depth;
	}
	
	public static boolean contains(ASTNodeOrNodeList n1, ASTNodeOrNodeList n2)
	{
		boolean matchFound = false;
		
		while (n2 != null)
		{
			n2 = n2.getParent();
			if (n2 != null && n2.equals(n1))
			{
				matchFound = true;
				break;
			}
		}
		
		return matchFound;
	}

	public boolean HasAncestor(Class searchClass) 
	{
		ASTNodeOrNodeList currentNode = root;
		
		boolean matchFound = false;
		
		while (currentNode != null && currentNode != parentTree && currentNode.hasParent())
		{
			currentNode = currentNode.getParent();
			
			if (currentNode != null && currentNode != parentTree &&
					searchClass.isInstance(currentNode)
				)
			{
				matchFound = true;
				break;
			}
		}
		
		return matchFound;
	}
}
