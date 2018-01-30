package objects;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Map;

import org.eclipse.jdt.core.*;
import org.eclipse.jdt.core.compiler.IProblem;
import org.eclipse.jdt.core.dom.*;

import algorithm.TreeSearchAlgorithm;

import query.QueryHandler;

public class TreeHandler {

	public String project;
	public File origin;
	public CompilationUnit root = null; // root node of AST of origin file
	public File treeFile; 
	
	//Generate the tree from source
	public void GenerateInitialTree() throws IOException
	{		
		int fileLength = (int)origin.length();
		FileReader fr = new FileReader(origin);
		char source[] = new char[fileLength];

		fr.read(source, 0, fileLength);
		fr.close();
		
		// Set up parsing		
		ASTParser parser = ASTParser.newParser(AST.JLS8);

		parser.setSource(source);
		Map options = JavaCore.getOptions();
		options.put(JavaCore.COMPILER_COMPLIANCE, JavaCore.VERSION_1_8);
		options.put(JavaCore.COMPILER_CODEGEN_TARGET_PLATFORM, JavaCore.VERSION_1_8);
		options.put(JavaCore.COMPILER_SOURCE, JavaCore.VERSION_1_8);
		parser.setCompilerOptions(options);

		
		//parser.setKind(ASTParser.K_COMPILATION_UNIT);
		parser.setResolveBindings(true);
		parser.setBindingsRecovery(true);
		parser.setStatementsRecovery(true);
		
		//parser.setEnvironment(null, null, null, true);
		//parser.setUnitName(origin.getName());

		// Perform parse
		
//		if (origin.getName().contains("JcmdProcess.java"))
//		{
//			System.out.println("--------------------!!!!!!!!!!!!!!!!!!!!!!!!!!-----------------------------------------------");
//		}
//		System.out.println("File: " + origin.getName());
//		if (origin.getName().contains("JcmdProcess.java"))
//		{
//			System.out.println("--------------------!!!!!!!!!!!!!!!!!!!!!!!!!!-----------------------------------------------");
//		}
		try
		{
			root = (CompilationUnit) parser.createAST(null);
		}
		catch (Exception e)
		{
			System.out.println("Couldn't parse " + origin.getName() + ". Exception: " + e.getMessage());
			root = null;
		}
		
//        IProblem[] problems = root.getProblems();
//	    for(IProblem problem : problems) {
//	        //System.out.println("Problem parsing " + project + ", " + origin.getName() + ": " + problem.getMessage() + ", line " + problem.getSourceStart());
//	        break;
//	    }
//	    if (origin.getName().contains("JcmdProcess.java"))
//	    {
//	    	System.out.println("---HERE GOES-----------------!!!!!!!!!!!!!!!!!!!!!!!!!!-----------------------------------------------");
//	    	if (TreeSearchAlgorithm.HasSubTree(root, EnumDeclaration.class))
//	    	{
//	    		System.out.println("DOES have enumdeclaration!");
//	    	}
//	    	else
//	    	{
//	    		System.out.println("Does NOT have enumdelcaration");
//	    	}
//	    	class ASTPrinter extends ASTVisitor {
//	    	      StringBuffer buffer = new StringBuffer();
//	    	      public void preVisit(ASTNode node) {
//	    	         //write the name of the node being visited
//	    	         printDepth(node);
//	    	         String name = node.getClass().getName();
//	    	         name = name.substring(name.lastIndexOf('.')+1);
//	    	         System.out.print(name + ":");
//	    	         
//	    	         System.out.print(" {\r\n");
//	    	      }
//	    	      public void postVisit(ASTNode node) {
//	    	         //write a closing brace to indicate end of the node
//	    	         printDepth(node);
//	    	         System.out.print("}\r\n");
//	    	      }
//	    	      void printDepth(ASTNode node) {
//	    	         //indent the current line to an appropriate depth
//	    	         while (node != null) {
//	    	            node = node.getParent();
//	    	            //buffer.append("  ");
//	    	            System.out.print("  ");
//	    	         }
//	    	      }
//	    	   }
//	    	root.accept(new ASTPrinter());
//	    }
	}
	
	public boolean saveToFile()
	{
		return false;
	}
	
	public boolean reconstructFromFile()
	{
		return false;
	}

}
