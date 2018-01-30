package main;
import results.ResultsHandler;
import java.io.File;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;

import java.util.Date;
import java.util.List;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.LinkedList;

import org.antlr.runtime.RecognitionException;
import org.eclipse.core.runtime.Assert;

import projects.ProjectProcessor;
import query.QueryHandler;
import objects.NodeChain;
import objects.ProjectTree;
import objects.Query;
import objects.ResultTree;
import objects.SelectorNode;

public class Controller {
	//public static String ROOT = "C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\";
	//public static String ROOT = "C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\data_area\\";
	public static String ROOT = "C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\data_area\\";
	public static String PROJECTROOT = "D:\\";
	public static String PROPERTIES_FILE = "locals.properties";
	//public static String ROOT = "";
	public static boolean DEBUG = false;
	public static boolean DOWNLOAD = false;
	public static LinkedList<ProjectTree> projectsList = new LinkedList<ProjectTree>(); 

	public static void getProjectDir()
	{
		String s = Controller.class.getProtectionDomain().getCodeSource().getLocation().getPath().toString();
		try {
			String s1 = URLDecoder.decode(s,"UTF-8");
			String s2 = new File(s1).getPath().toString();
			//ROOT = s2.substring(0,s2.length()-3)+ "src\\";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/*
	public static void TestProjects()
	{
		if(DEBUG) System.out.println("before download");
		ProjectProcessor.DownloadProjects(true);
		if(DEBUG) System.out.println("post download");
		//if(!DEBUG)
			ProjectProcessor.UnZipProjects();
		ProjectProcessor.BuildProjectTrees();
		if(DEBUG) System.out.println("build trees");

		if(DEBUG)
			for (ProjectTree p : projectsList)
			{
				System.out.println("print: " + p.projectName);
				p.print();
			}
	}*/

//	public static void TestQuery()
//	{
//
//		try {
//			QueryHandler.ReadUserQuery();
//			QueryHandler.printQueries();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (RecognitionException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
//	}

	public static void TestFileTreeCreation()
	{
		objects.FileTree t = new objects.FileTree(new File(ROOT + "projects\\ProjectProcessor.java"),"Senior-Design");
		if (t.root != null)
			algorithm.TreeSearch.HasSubTree(t.root, "InputStream is = process.getInputStream();			InputStreamReader isr = new InputStreamReader(is);");

	}
/*
	public static void GetProjects()
	{
		ProjectProcessor.DownloadProjects(DOWNLOAD);
		if(DOWNLOAD)
			ProjectProcessor.UnZipProjects();
		ProjectProcessor.BuildProjectTrees();
	}*/

	public static void InterpretQuery(String queryFile) throws Exception
	{
		QueryHandler.ReadUserQuery(queryFile);
	}

	public static void SearchAlgorithm(LinkedList<Query> queries, String localsFile, String localsOutputFile, boolean topLevel, LinkedList <NodeChain> additionalVars)
	{
		if (localsFile != null)
		{
			QueryHandler.readLocals(ROOT + localsFile, additionalVars);			
		}
		else
		{
			QueryHandler.readLocals(ROOT + PROPERTIES_FILE, additionalVars);
		}
		
		LinkedList<ResultTree> resultTrees = null;
		
		//for (Query q : queries)		
		for (int i = 0; i < queries.size(); i++)			
		{
			Query q = queries.get(i);
			
			if (q.isTopLevel)
			{
				//resultTrees = QueryHandler.executeQuery(q, null, resultTrees, localsOutputFile);
				if (q.queryName != null)
					System.out.println("Query " + q.queryName + ":");
				resultTrees = QueryHandler.executeQuery(q, null, null, localsOutputFile, true);
			}
		}

		if (resultTrees != null)
		{
			if (topLevel && QueryHandler.printSum)
				ResultsHandler.PrintNumResults(resultTrees);
			else
				ResultsHandler.PrintResults(resultTrees);
		}
		else
		{
			System.out.println("No results.");
		}
		//QueryHandler.localVars.clear();
	}


	public static void Run(String projectName, String queryFile, String localsFile, String localsOutputFile, LinkedList <NodeChain> additionalVars)
	{
		try{			
			ProjectProcessor.BuildProjectTree(projectName);
			
			try{
				InterpretQuery(queryFile);
				
				try{
					SearchAlgorithm(QueryHandler.queries, localsFile, localsOutputFile, true, additionalVars);
				}
				catch (Exception e)
				{
					System.out.println("Error during Search");
					e.printStackTrace();
				}
			}catch (Exception e)
			{
				System.out.println("Error during query interpretation:");
				e.printStackTrace();
			}						
		}
		catch (Exception e)
		{
			System.out.println("Error during project download");
			e.printStackTrace();
		}

	}

	public static void main(String[] args) throws IOException {
		getProjectDir();
		System.out.println(ROOT);
		//TestProjects();
		//TestQuery();
		//TestFileTreeCreation();
		//TestTreeSearchAlgorithm();
		String projectName = null, queryFile = null, localsFile = null, localsOutputFile = null;
		String projectListFile = null, queryListFile = null;
		boolean argsFailed = false;
		boolean preserveResults = false;
	
		long startTime = System.currentTimeMillis(), endTime;	
		
		if (args.length >= 2 && args.length <= 5)
		{
			int arg = 0;
			projectName = args[arg];
			
			if (projectName.equals("-P"))
			{
				arg++;
				projectName = null;
				projectListFile = args[arg];
			}
			
			arg++;

			queryFile = args[arg];
			
			if (queryFile.equals("-Q"))
			{
				arg++;
				queryFile = null;
				queryListFile = args[arg];
			}

			arg++;
			
			if (args.length >= arg + 1)
			{
				if (args[arg].equals("-preserveresults"))
				{
					preserveResults = true;
					arg++;
				}				
			}
						
			if (args.length >= arg + 1)
			{
				localsFile = args[arg];
			}

			arg++;
			
			if (args.length >= arg + 1)
			{
				localsOutputFile = args[arg];				
			}
		}
		else
		{
			argsFailed = true;
		}
		
		if (projectName != null && queryFile != null)
		{
			Run(projectName, queryFile, localsFile, localsOutputFile, null);
		}
		else if (projectListFile != null && queryListFile != null)
		{
			List <String> queryFiles, projectNames;

			Path queryListFilePath = new File(ROOT + queryListFile).toPath();
			Path projectListFilePath = new File(ROOT + projectListFile).toPath();
			Charset charset = Charset.defaultCharset();
			
			queryFiles = Files.readAllLines(queryListFilePath, charset);
			projectNames = Files.readAllLines(projectListFilePath, charset);
			
			LinkedList <NodeChain> additionalVars = null;
			int i = 0;
			
			for (String p : projectNames)
			{
				boolean first = true;
				i = i + 1;

				for (String q : queryFiles)
				{
					if (!p.equals("") && !q.equals(""))
					{
						String lIn, lOut;
	
						lOut = "output\\" + p + ".output";
						
						if (first == true && !preserveResults)
						{
							first = false;
							String [] pArray = p.split("-");
							
							// TODO change this plz to use a different delimeter & rename the historical projects
							//String [] pBaseArray = new String[pArray.length - 1];
							//System.arraycopy(pArray, 0, pBaseArray, 0, pArray.length - 1);
							String [] pBaseArray = new String[pArray.length];
							System.arraycopy(pArray, 0, pBaseArray, 0, pArray.length);
							String pBase = String.join("-",  pBaseArray);

							String yearString = new String("");
							
							try
							{
								Integer year = new Integer(Integer.parseInt(pArray[pArray.length-1]));
								yearString = year.toString();
								
								// add local var for year
							
								NodeChain nc = new NodeChain();
								nc.nodeList = new LinkedList<SelectorNode>();
								nc.localVarValue = new NodeChain.VarResult();
								nc.name = new String("Year");
								
 							    nc.localVarValue.intResultFound = true; 
							    nc.localVarValue.intResult = year;
							    nc.localVarValue.stringResultFound = false;
							    nc.localVarValue.stringResult = null;
							    
							    if (additionalVars == null) additionalVars = new LinkedList <NodeChain> ();
							    additionalVars.add(nc);
							    
							    // add local var for base name
							    
								nc = new NodeChain();
								nc.nodeList = new LinkedList<SelectorNode>();
								nc.localVarValue = new NodeChain.VarResult();
								nc.name = new String("Project Base Name");
								
 							    nc.localVarValue.intResultFound = false; 
							    nc.localVarValue.intResult = 0;
							    nc.localVarValue.stringResultFound = true;
							    nc.localVarValue.stringResult = pBase;
							    
							    additionalVars.add(nc);
							    
							}
							catch (Exception e)							
							{
							
							}
									
							lIn = "inputprops\\" + pBase + ".properties";					
						}
						else
						{
							lIn = lOut;
						}
						//Controller.projectsList = new LinkedList <ProjectTree> ();
						QueryHandler.queries = new LinkedList<Query>();
						System.out.println("Project " + i + "/" + projectNames.size() + ": Run(" + p + ", " + q + ", " + lIn + ", " + lOut + ");");
						Run(p, q, lIn, lOut, additionalVars);
					}
				}
				projectsList.clear();
				//projectNames.clear();								
			}
			endTime = System.currentTimeMillis();			
			
			System.out.println("Processed " + queryFiles.size() + " queries over " + projectNames.size() + " projects in " + (endTime - startTime) / 1000 + " seconds.");
		}
		
		if (argsFailed)
		{
			Assert.isTrue(false, "Arguments: projectname queryfile [localsfile] [locals output file]");
		}
	}
}
