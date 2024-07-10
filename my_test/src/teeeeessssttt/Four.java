package teeeeessssttt;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class Four {
	public static void main(String[] args) {
	try {
		FileWriter file = new FileWriter("C:/Users/nkhar/Desktop/java2.txt",true);
		
		PrintWriter pw = new PrintWriter(new BufferedWriter(file));
		
		pw.println("pineapple");
		pw.println("banana");
		
		
		pw.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}