package algorithm;
// for testing tree saving/reconstruction
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTMatcher;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.TypeDeclaration;

public class TreeSearch extends ASTVisitor{

	// During tree traversal, keep track of the source tree we are searching and the
	// tree containing the search string 
	private CompilationUnit treeToSearch;
	private ASTNode searchTree;
	
	public static void HasSubTree(CompilationUnit tree, String search)
	{ 
		ASTNode searchTree = parseSearchString(search);
		// perform search using AST visitor -- as we visit each node, compare to the search string
		TreeSearch staticSearchVisitor = new TreeSearch(tree, searchTree);
		tree.accept(staticSearchVisitor);
	}

	// Constructor
	public TreeSearch(CompilationUnit sourceToSearch, ASTNode searchTree)
	{
		this.treeToSearch = sourceToSearch;
		this.searchTree = searchTree;
	}

	// Parse search string into AST tree
	private static ASTNode parseSearchString(String searchText)
	{
		// Set up parsing
		ASTParser parser = ASTParser.newParser(AST.JLS8);
		parser.setSource(searchText.toCharArray());
		parser.setKind(ASTParser.K_STATEMENTS);		

		// Perform parse (will return a Block since we specified K_STATEMENTS
		Block b = (Block)parser.createAST(null);
		
		return (ASTNode)b.statements().get(0);
	}

	// Visits each node in source file during tree traversal and compares against
	// search tree
	public void preVisit(ASTNode node)
	{	
		System.out.print(".");
		
		// Use ASTMatcher to compare this node against the search tree
		/*if (node.subtreeMatch(new ASTMatcher(), searchTree))
		{
			// We matched - get source position and print result to console
			int lineNum = treeToSearch.getLineNumber(node.getStartPosition());
			System.out.println("\nMatch found on line " + lineNum);
		}*/

		//if(testAttribute(node))
		//	matches.add(new ResultTree(node));
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
