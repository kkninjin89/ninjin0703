package teeeeessssttt;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class Three {
	public static void main(String[] args) {
	try {
		FileWriter file = new FileWriter("C:/Users/nkhar/Desktop/java2.txt");
		
		PrintWriter pw = new PrintWriter(new BufferedWriter(file));
		
		pw.println("apple");
		pw.println("orange");
		pw.println("melon");
		
		pw.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}
