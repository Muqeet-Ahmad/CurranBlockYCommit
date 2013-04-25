/* Muqeet Ahmad
 * Program reads from a File and prints the words into another file
 * Might be helpful in getting all the questions into the program
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class FileReader {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File outFile = new File("outFileMerged.txt");
		PrintWriter out = null; 	
		try {
			out = new PrintWriter(outFile);
		} catch (FileNotFoundException e) {
			System.out.println("Unable to open outfile. Exiting program.");
			e.printStackTrace();
			System.exit(2);
		}
		File inFile1 = new File("AlphaFile1.txt");
		File inFile2 = new File("AlphaFile2.txt");
		Scanner in = null;
		Scanner in1 = null;
		try{ 
			in = new Scanner(inFile1);
			in1 = new Scanner(inFile2);
		} catch (FileNotFoundException e){
			System.out.println("Unable to  open file. Exiting program.");
		e.printStackTrace();
		System.exit(1);
		}
		
		String line1 = in.nextLine();
		String line2 = in1.nextLine();
		while(in.hasNext() && in1.hasNext()){
			if(line1.compareTo(line2) < 0){
				out.println(line1);
				line1 = in.nextLine();
			} else{
				out.println(line2);
				line2 = in1.nextLine();
			}
		}
		while(in.hasNext()){
			/*if(line2 != null && line1.compareTo(line2)>0){
				out.println(line2);
				line2 = null;
			} else {*/
				out.println(line1);
				line1 = null;
			
		}
		while(in1.hasNext()){
			/*if(line1 != null && line2.compareTo(line1)>0){
				out.println(line1);
				line1 = null;
			} else {*/
				out.println(line2);
				line2 = null;
			
		}
		in.close();
		in1.close();
		out.close();
		System.out.println("File created successfully.");
	}

}
