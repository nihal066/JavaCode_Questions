package map;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ReadingFile {

	public static void main(String[] args)throws FileNotFoundException {
		Set<String> set=new TreeSet<>();

		File file1=new File("names.txt");

		Scanner sc1=new Scanner(file1);

		while(sc1.hasNextLine()) {
			String data1=sc1.nextLine();
			set.add(data1);
		}
		System.out.println(set);

		try{File myfile = new File("/Users/nihal/Desktop/myapp/app.txt");

		Scanner sc = new Scanner(myfile);

		while(sc.hasNext()) {

			String data = sc.nextLine();

			System.out.println(data+"\n");
		}
		System.out.println();
		}

		catch(Exception e) {

		}

//		try {
//			File mysecondFile=new File("/Users/nihal/Desktop/myapp/duo.txt");
//
//			Scanner scan = new Scanner(mysecondFile);
//
//			while(scan.hasNextLine()) {
//
//				String str = scan.nextLine();
//
//				System.out.println(str);
//			}
//		}
//		catch(Exception e) {
//
//		}
//
//
//
//
//	}

}
}
