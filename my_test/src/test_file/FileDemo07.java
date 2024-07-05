package test_file;
import java.io.File;
public class FileDemo07 {
	 public static void main(String[] args) {
		 
	        File file1 = new File("D:/path/to/file5.txt");
	        File file2 = new File("D:/path/to/file9.txt");
	        int result = file1.compareTo(file2);
	        System.out.println("Comparison result: " + result);
	 }
}