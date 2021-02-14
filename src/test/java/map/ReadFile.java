package map;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadFile {
	public static void main(String args []) throws FileNotFoundException {
//
//		Object t=new Integer(107);
//		int k=((Integer)t).intValue()/9;
//		System.out.println(k);
		try {
		File myObj = new File("/Users/nihal/IdeaProjects/javaproject/nihal.txt");
	      Scanner myReader = new Scanner(myObj);
	      while (myReader.hasNextLine()) {
	        String data = myReader.nextLine();
	        System.out.println(data);
	      }
		}catch(Exception e) {
			
		}
		
		File f= new File("gul.txt");
		File f1 = new File("anotherFile.txt"); // ,File class only reads the file ,if file does not exist
		                                      // nothing happens
		PrintWriter pw = new PrintWriter(f); //I created a new file and opened a connection to it
		                                      //when you open , you have to close to it
		pw.print("Hello");
		pw.print("world");
		
		
	}

}
