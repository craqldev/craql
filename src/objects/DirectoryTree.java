package objects;

import java.io.File;
import java.io.FileFilter;
import java.util.LinkedList;

public class DirectoryTree {
	public String projectName;
	public LinkedList<DirectoryTree> dirs = new LinkedList<DirectoryTree>();
	public LinkedList<FileTree> files = new LinkedList<FileTree>();
	String name;
	
	private FileFilter dirFilter = new FileFilter() {       // Returns directories
		public boolean accept(File file) {
			return file.isDirectory();
		}
	};

	private FileFilter sourceFilter = new FileFilter() {	// Returns java files
		public boolean accept(File file) {
			return file.isFile() && file.getName().endsWith(".java");
		}
	};
	
	public DirectoryTree()
	{
	}
	
	public DirectoryTree(File root, String ProjectName)
	{
		projectName = ProjectName;
		name = root.getName();
		for(File f : root.listFiles(dirFilter)){
			dirs.add(new DirectoryTree(f, projectName));
		}
		for(File f : root.listFiles(sourceFilter)){
			files.add(new FileTree(f, projectName));
		}
	}
	
	public void print(int indent)
	{
		StringBuffer sb = new StringBuffer(indent);
		
		for ( int i = 0; i < indent; i++ )
			sb = sb.append("   ");
		
		for(DirectoryTree dir: dirs)
		{
			System.out.println(sb.toString() + dir.name);
			dir.print(indent+1);
		}
		for(FileTree file: files)
		{
			System.out.println(sb.toString() + file.origin.getAbsolutePath());
		}
	}
}



