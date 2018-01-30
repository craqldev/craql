package objects;

import java.io.File;
import java.io.IOException;

import main.Controller;

public class FileTree extends TreeHandler{

	public FileTree(File sourceFile, String projectName)
	{
		super.project = projectName;
		super.origin = sourceFile;
		try {
			super.GenerateInitialTree();
		} 
		catch (IOException e) {
			if (Controller.DEBUG)
				System.out.println(e.getMessage());
		}
	}

	public FileTree(File sourceFile) {
		super.project = null;
		super.origin = sourceFile;
		try {
			super.GenerateInitialTree();
		} 
		catch (IOException e) {
			if (Controller.DEBUG)
				System.out.println(e.getMessage());
		}
	}
	
	public FileTree()
	{
		super.project = null;
		super.origin = null;
	}

	public String PrintTree()
	{
		if (super.root != null)
			return super.project + "\n" + super.origin + "\n" + super.root.toString();
		else
			return super.project + "\n" + super.origin + "\n" + "(Parse Failed)";
	}
}
