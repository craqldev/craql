package main;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;
import java.util.SortedMap;
import java.util.Vector;
import java.lang.*;
import java.io.*;

public class BuildProjectProps {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		File propslist = new File(Controller.ROOT + "inputprops\\projecttags.csv");

		BufferedReader fr = new BufferedReader(new FileReader(propslist));
		String line;
		
		line = fr.readLine();
		
		String [] tagNames = line.split(",", -1);		
		
		while ((line = fr.readLine()) != null)
		{
			String [] tagVals = line.split(",",-1);
			
			PrintWriter pw = new PrintWriter(Controller.ROOT + "inputprops\\" + tagVals[0] + ".properties");

			System.out.println("Writing props for " + tagVals[0]);
			for (int i = 1; i < tagVals.length; i++)
			{
				String outVal;
				
				if (tagVals[i].contains("Yes"))
				{
					outVal = new String("true");
				}
				else
				{
					outVal = new String("false");
				}
				pw.println(tagNames[i] + "=" + outVal);
			}
			pw.close();
		}
	}
}
