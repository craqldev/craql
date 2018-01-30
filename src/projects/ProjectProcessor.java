package projects;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;

import main.Controller;

import objects.ProjectTree;

public class ProjectProcessor {

	static String projectsDir = main.Controller.PROJECTROOT + "projects\\";
	//static String projectsDir = "F:\\projects\\";
	static String projectsNamesFile = main.Controller.PROJECTROOT + "projects\\ProjectNames.txt";
	static LinkedList<String> projectNames = new LinkedList<String>();
	static ProjectTree currentProjectTree = null;


	public static void main(String args[])
	{
		DownloadProjects(true);
	}
	/* Reads the projectNamesFile and will download all corresponding projects
	 * 
	 */
	public static void DownloadProjects(boolean download){
		try {
			Scanner s = new Scanner(new File(projectsNamesFile));
			while (s.hasNext())
			{
				String project = s.nextLine();
				if (download)
					DownloadProjectSource(project);
				projectNames.add(project);
			}
			s.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	/* Input: String projectName
	 * Using a url template for SourceForge, downloads the project tar.gz file
	 */
	public static void DownloadProjectSource(String projectName) {
		try {
			System.out.println("http://" + projectName + ".cvs.sourceforge.net/viewvc/" + projectName + "/?view=tar");
			URL url = new URL("http://" + projectName + ".cvs.sourceforge.net/viewvc/" + projectName + "/?view=tar");
			URLConnection conn = url.openConnection();
			InputStream in = conn.getInputStream();
			FileOutputStream out = new FileOutputStream(projectsDir /*+"\\"+ projectName + "\\"*/+ projectName + ".tar.gz");
			byte[] b = new byte[1024];
			int count;
			while ((count = in.read(b)) >= 0) {
				out.write(b, 0, count);
			}
			out.flush(); out.close(); in.close();                   

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/* Iterates through projects and unzips each into their own folder
	 * 
	 */
//	public static void UnZipProjects()
//	{
//		for(String projectName : projectNames){
//			try{
//			ProcessBuilder builder = new ProcessBuilder("\"C:\\Program Files\\7-Zip\\7z\"", "x", projectsDir+projectName+".tar.gz");
//			builder.directory(new File(projectsDir));
//			//Map<String, String> environ = builder.environment();
//
//			final Process process = builder.start();
//			InputStream is = process.getInputStream();
//			InputStreamReader isr = new InputStreamReader(is);
//			BufferedReader br = new BufferedReader(isr);
//			String line;
//			while ((line = br.readLine()) != null) {
//				System.out.println(line);
//			}
//			System.out.println("Program terminated!");
//
//			ProcessBuilder builder2 = new ProcessBuilder("\"C:\\Program Files\\7-Zip\\7z\"", "x", projectsDir+projectName+".tar");
//			//File direct = new File(projectsDir+projectName+"\\");
//			//if (!direct.exists())
//			//	direct.mkdir();
//			builder2.directory(new File(projectsDir));
//			//Map<String, String> environ = builder.environment();
//
//			final Process process2 = builder2.start();
//			InputStream is2 = process2.getInputStream();
//			InputStreamReader isr2 = new InputStreamReader(is2);
//			BufferedReader br2 = new BufferedReader(isr2);
//			String line2;
//			while ((line2 = br2.readLine()) != null) {
//				System.out.println(line2);
//			}/
//			System.out.println("Program terminated!");
//			}
//			catch(Exception e)
//			{
//				e.printStackTrace();
//			}
//		}
//	}

	/* Input: none
	 * Iterates through project names and calls FindSourceFolder
	 * Calls BuildProjectAST to create the project tree
	 * Output: none
	 */
	
	public static void BuildProjectTree(String projectName)
	{
		if (!projectNames.contains(projectName))
		{
			//projectNames.clear();
			projectNames.add(projectName);
			
			ProjectTree project = new ProjectTree(new File(projectsDir+projectName),projectName);
			Controller.projectsList.add(project);
		}
	}

	public static void BuildProjectTrees()
	{
		for (String name: projectNames)
		{
			//File source = FindSourceFolder(new File(projectsDir+name));
			ProjectTree project = new ProjectTree(new File(projectsDir+name),name);
			Controller.projectsList.add(project);
			//System.out.println(source.getAbsolutePath());
			
			// Continue to build tree
		}
		
	}
	
	
	/* Input: file
	 * Iterates through the sub-directories to find the .java files
	 * Output: the ProjectTree object containing the source files.
	 */
	public static ProjectTree FindSourceFiles(File directory)
	{
		return null;

	}
	

	/* Input: String project path
	 * Finds the source folder of the project
	 * Iterates through the files and will create the Project AST
	 * Output: None
	 */
	/*public static void BuildProjectAST(String projectRoot)
	{
		File directory =  new File(projectRoot) ;

		File sourceDirectory = FindSourceFolder(directory);

		// Needs to be recursive ********
		if(sourceDirectory != null){
			File subFiles[] = sourceDirectory.listFiles();

			for(File F : subFiles)
			{
				System.out.println("  " + F.getName() + " " + F.getPath());
				BufferedReader input;
				try {
					input = new BufferedReader(new FileReader(F));
					 add AST generation code
				} catch (FileNotFoundException e) {
					System.out.println("Error opening file: " + F);
					continue;
				}

			}
		}
		return;
	}*/
}
