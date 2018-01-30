package algorithm;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.lang.reflect.*;

import org.eclipse.core.runtime.Assert;

import objects.*;
public class Search {
	
	HashMap <Query, List <ProjectTree> > resultCache = new HashMap <Query, List <ProjectTree>> ();

	public static LinkedList<ResultTree> SearchTrees (Query query, List<ProjectTree> trees)
	{
		LinkedList<ResultTree> results = new LinkedList<ResultTree>();

		for(ProjectTree proj: trees)
			results.addAll(SearchTree(query, proj.projectTree));
		return results;
	}

	
	public static LinkedList<ResultTree> SearchTree(Query query, DirectoryTree tree)
	{
		LinkedList<ResultTree> results = new LinkedList<ResultTree>();
		
		SearchCriteria sc = new SearchCriteria(query);
		
		for(DirectoryTree dir: tree.dirs)
			results.addAll(SearchTree(query, dir));
		
		for(FileTree fileTree: tree.files){
			if (fileTree.root != null)
			{
				algorithm.TreeSearchAlgorithm.HasSubTree(fileTree.root, sc);	
				for (ResultTree t: algorithm.TreeSearchAlgorithm.matches)
				{
					t.project = fileTree.project;
					t.origin = fileTree.origin;				
					results.add(t);
				}
				//results.addAll(algorithm.TreeSearchAlgorithm.matches);
			}
		}
		
		return results;
	}
	
	public static LinkedList<ResultTree> SearchTrees(Query query, LinkedList<ResultTree> inputTrees)
	{
		LinkedList<ResultTree> results = new LinkedList<ResultTree>();
		
		SearchCriteria sc = new SearchCriteria(query);
		
		Class searchClass = sc.searchClass;
		
		for (ResultTree inputTree : inputTrees)
		{
			results.addAll(SearchTree(inputTree, searchClass));
		}
		return results;
	}
	
	//public static LinkedList<ResultTree> SearchResultTrees (List<ResultTree> trees)
	//{
//		LinkedList<ResultTree> results = new LinkedList<ResultTree>();
		//
		//for(ResultTree proj: trees)
//			results.addAll(SearchTree(proj));
		//return results;
	//}

	//public static LinkedList<ResultTree> SearchTree(ResultTree tree)
	//{
//		return SearchTree(tree, Query.searchNodeType);
//	}
	
	public static Class getClassFromSearchNodeType(String searchNodeType)
	{
		Class searchClass = null;
		
		try
		{
			searchClass = Class.forName("org.eclipse.jdt.core.dom." + searchNodeType);
			
			if (!(Class.forName("org.eclipse.jdt.core.dom.ASTNode").isAssignableFrom(searchClass)))
			{
				System.out.println(searchNodeType + " is not an ASTNode.");
				Assert.isTrue(false);
			}
		}
		catch (ClassNotFoundException c)
		{
			System.out.println("Class " + searchNodeType + " not found.");
			Assert.isTrue(false);			
		}	
		
		return searchClass;
	}
	
	public static LinkedList<ResultTree> SearchTree(ResultTree tree, Class searchClass)
	{
		LinkedList<ResultTree> results = new LinkedList<ResultTree>();

		//System.out.println(nodetype);

			algorithm.TreeSearchAlgorithm.HasSubTree(tree.root, searchClass);
			for (ResultTree t: algorithm.TreeSearchAlgorithm.matches)
			{
				t.project = tree.project;
				t.origin = tree.origin;
				t.parentTree = tree.root;
				results.add(t);
			}
			//results.addAll(algorithm.TreeSearchAlgorithm.matches);
		
		return results;
	}
}
