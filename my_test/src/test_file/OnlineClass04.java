package test_file;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class OnlineClass04 {
	public static void main(String[] args) throws IOException{
		FileWriter file = new FileWriter("D:/path/to/file13.txt");
		
		PrintWriter pw = new PrintWriter(new BufferedWriter(file));
		
		pw.println("apple");
		pw.println("orange");
		pw.println("melon");
		
		pw.close();
		
	}
}
