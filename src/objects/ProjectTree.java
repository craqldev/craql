package objects;

import java.io.File;
import java.io.FileFilter;
import java.util.LinkedList;
import java.util.Queue;

public class ProjectTree extends DirectoryTree {
	
	public File sourceFolder;
	public DirectoryTree projectTree;

	public ProjectTree(File root, String name)
	{
		sourceFolder = root;
		projectName = name;
		
		System.out.println(projectName);
		try
		{
			projectTree = new DirectoryTree(root, name);
		}
		catch (Exception e)
		{
			System.out.println("Couldn't open project " + name + ". Exception: " + e.getMessage());
			System.exit(0);
		}
	}
	
	public void print()
	{
		System.out.println(projectName);
		System.out.println(sourceFolder.getAbsolutePath());
		projectTree.print(0);
	}
}

