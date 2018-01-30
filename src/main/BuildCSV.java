package main;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;
import java.util.SortedMap;
import java.util.Vector;

public class BuildCSV {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File dir = new File(Controller.ROOT + "output\\");
		FileFilter filter = new FileFilter() {	// Returns .output files
			public boolean accept(File file) {
				return file.isFile() && file.getName().contains(".output");
			}
		};
		
		try 
		{
			HashMap <String, HashMap <String, String> > projectMap = new HashMap <String, HashMap <String, String> > ();
			HashMap <String, String> columnNames = new HashMap <String, String> ();
			//SortedMap <String, String> columnNames2 = new SortedMap <String, String> ();
			
			for(File f : dir.listFiles(filter))
			{
				FileReader fr;
				// project name is filename - ".output"
				String projectName = f.getName().substring(0, f.getName().length() - 7);
				System.out.println("Reading " + projectName);

				fr = new FileReader(f);
				Properties p = new Properties();
				p.load(fr);
 
				HashMap <String, String> csvMap;
				
				csvMap = new HashMap <String, String> ();
				csvMap.clear();
					
				for (Enumeration<?> e = p.propertyNames(); e.hasMoreElements();)
				{
					String key = (String)(e.nextElement());
					String value = p.getProperty(key);
						
					if (!key.startsWith("temp_"))
					{
						csvMap.put(key, value);
						if (!value.equals("[no value]"))
						{
							columnNames.put(key, key);
						}
					}
				}
				projectMap.put(projectName, csvMap);				
				fr.close();
			}

			Set <String> columnSet = columnNames.keySet();
			Vector <String> columnVector = new Vector <String> (columnSet);
			Collections.sort(columnVector);
	
			int w = columnVector.size() + 1;
			int h = projectMap.size() + 1;
			String csv[][] = new String[w][h];
			
			int x = 0;
			int y = 1;
			
			for (String projectName : projectMap.keySet())
			{
				csv[x][y] = projectName;
				y++;
			}
			
			csv[0][0] = new String("Project");

			x = 1;
			y = 0;
			for (String columnName : columnVector)
			{
				y = 0;
				csv[x][y] = columnName;
				y++;
				for (String projectName : projectMap.keySet())
				{
					if (projectMap.get(projectName).containsKey(columnName))
					{
						csv[x][y] = projectMap.get(projectName).get(columnName);
					}
					else
					{
						csv[x][y] = new String("");
					}				
					y++;
				}
				x++;
			}
			
			File outFile = new File(Controller.ROOT + "output\\out.csv");			
			FileWriter fw = new FileWriter(outFile);
			System.out.println("Writing output");
			
			for (y = 0; y < h; y++)
			{
				for (x = 0; x < w; x++)
				{					
					fw.write(csv[x][y]);
					if (x < w-1)
					{
						fw.write(",");
					}
				}
				fw.write("\n");
			}
			fw.close();

			System.out.println("Done!");			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
