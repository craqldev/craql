package algorithm;

import java.util.LinkedList;
import java.util.*;

import main.Controller;
import objects.*;

import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTMatcher;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.ImportDeclaration;
import org.eclipse.jdt.core.dom.*;

public class TreeSearchAlgorithm extends ASTVisitor{

	// During tree traversal, keep track of the source tree we are searching and the
	// tree containing the search string 
	private ASTNode treeToSearch;
	private Class nodeType;
	public static LinkedList<ResultTree> matches;
	
	public static boolean HasSubTree(ASTNodeOrNodeList tree, SearchCriteria sc)
	{
		LinkedList<ResultTree> tempMatches = new LinkedList<ResultTree>();
		boolean tempResult = false;
		
		for (Object nodeObj : tree.getAsList().list)
		{
			ASTNode node = (ASTNode)nodeObj;
			if (HasSubTree(node, sc))
			{
				tempResult = true;
				tempMatches.addAll(matches);
			}
		}
		return tempResult;
	}
	
	public static boolean HasSubTree(ASTNode tree, SearchCriteria sc)
	{
		LinkedList<ResultTree> tempMatches;
		LinkedList<ResultTree> outputMatches = new LinkedList<ResultTree>();
		ResultTree deepestMatch = null;
		int matchDepth = 0;
		
		// first perform the basic search, then refine based on the operator (* or ...)
		HasSubTree(tree, sc.searchClass);
		
		if (sc.operandClass != null)
		{
			tempMatches = matches;
			
			for (ResultTree match : tempMatches)
			{
				ASTNodeOrNodeList root = match.getRoot();				
				ASTNodeOrNodeList listRoot = root.getAsList();
				
				for (Object rootObj : listRoot.list)
				{
					ASTNode rootNode = (ASTNode)rootObj;
					
					if (HasSubTree(rootNode, sc.operandClass))
					{
						for (ResultTree innerMatch : matches)
						{
							ResultTree outputMatch = new ResultTree(match.root, innerMatch.root);
							
							if (sc.op.equals("*"))
							{								 
									outputMatches.add(outputMatch);
							}
							else if (sc.op.equals("..."))
							{
								if (deepestMatch == null || ResultTree.depthBetween(root, match.root) > matchDepth)
								{
									deepestMatch = outputMatch;
									matchDepth = ResultTree.depthBetween(root, innerMatch.root);
								}
							}
							else
							{
								org.eclipse.core.runtime.Assert.isTrue(false);
							}
						}						
					}
				}
			}
			
			if (deepestMatch != null) outputMatches.add(deepestMatch);
			
			matches = outputMatches;
		}
		
		return !matches.isEmpty();
	}

	public static boolean HasSubTree(ASTNodeOrNodeList tree, Class search, LinkedList<ResultTree> outResults)
	{
		boolean tempResult = false;
		outResults.clear();
		for (Object nodeObj : tree.getAsList().list)
		{
			ASTNode node = (ASTNode)nodeObj;
			if (HasSubTree(node, search))
			{
				tempResult = true;
				outResults.addAll(matches);
			}
		}
		return tempResult;
	}
	
	public static boolean HasSubTree(ASTNodeOrNodeList tree, Class search)
	{
		LinkedList<ResultTree> tempMatches = new LinkedList<ResultTree>();
		boolean tempResult = false;
		
		tempResult = HasSubTree(tree, search, tempMatches); 

		return tempResult;
	}	
	
	public static boolean HasSubTree(ASTNode tree, Class search)
	{ 
		// perform search using AST visitor -- as we visit each node, compare to the search string
		//matches = new LinkedList<ResultTree>();
		matches = new LinkedList<ResultTree>();
		TreeSearchAlgorithm staticSearchVisitor = new TreeSearchAlgorithm(tree, search);
		tree.accept(staticSearchVisitor);
		return !staticSearchVisitor.matches.isEmpty();
	}

	// Constructor
	public TreeSearchAlgorithm(ASTNode sourceToSearch, Class nodeType)
	{
		this.treeToSearch = sourceToSearch;
		this.nodeType = nodeType;
	}

	// Visits each node in source file during tree traversal and compares against
	// search tree
	public void preVisit(ASTNode node)
	{	
		if(Controller.DEBUG)
			System.out.print(".");

		// Use ASTMatcher to compare this node against the search tree
		//if (node.getClass() == nodeType)
		if (nodeType.isAssignableFrom(node.getClass()))
		{
			//if(Controller.DEBUG)
			//System.out.println(treeToSearch.getLineNumber(node.getStartPosition()));
			//if(!query.QueryHandler.getParent)
				matches.add(new ResultTree(node));
			//else
				//matches.add(new ResultTree(node.getParent()));
			
			// Add checks for attr/prop
			
			//if(testAttribute(node))
			//	matches.add(new ResultTree(node));
		}
	}

	public boolean testAttribute(ASTNode node)
	{
		boolean isFound = false;
		TypeDeclaration t = (TypeDeclaration) node;
		//System.out.println(t.getName());
		if(!t.isInterface()){
			//System.out.println(t.isInterface());
			
			for(Object o: t.superInterfaceTypes())
			{
				if (o.toString().equals("Comparable"))
					isFound=true;
			}
		}
		return isFound;
	}





}
