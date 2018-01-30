package results;

import main.Controller;
import objects.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class ResultsHandler {

	static String outputDir = main.Controller.ROOT + "output\\" + query.QueryHandler.queries.getFirst().queryName + "\\";
	static int count;
	public static void PrintResults(LinkedList<ResultTree> results) 
	{

		System.out.println("Results:");
		System.out.println(results.size());

		if(Controller.DEBUG)
			for(ResultTree r: results)
			{
				System.out.println(r.PrintTree());
			}
//		File theDir = new File(outputDir);
//		if (!theDir.exists()) theDir.mkdir();
//		
//		Scanner s;
//		count = 1;
//		for(ResultTree r: results)
//		{
//			File f = new File(outputDir + "result-" + count + ".txt");
//			try {
//				f.createNewFile();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//				continue;
//			}
//			try {
//				BufferedWriter out = new BufferedWriter(new FileWriter(f));
//				out.write(r.PrintTree());
//				out.close();
//			} catch (IOException e) {		
//				e.printStackTrace();
//				continue;
//			}
//			count++;
//		}
	}
	public static void PrintNumResults(LinkedList<ResultTree> results) 
	{

		File theDir = new File(outputDir);
		if (!theDir.exists()) theDir.mkdir();
		
		System.out.println("Results:");
		System.out.println(results.size());

		if(Controller.DEBUG)
			for(ResultTree r: results)
			{
				System.out.println(r.PrintTree());
			}


		File f = new File(outputDir + "result-0.txt");
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(f));
			out.write(results.size()+"");
			out.close();
		} catch (IOException e) {		
			e.printStackTrace();
		}

	}
}
