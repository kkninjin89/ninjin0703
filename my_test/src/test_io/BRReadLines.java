package test_io;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;      
public class BRReadLines {

	public static void main(String[] args) throws IOException {
		String str ;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter line of your text.");
		System.out.println("enter 'end' to quit.");
		do {
			str = br.readLine();
			System.out.println(str);
		} while (!str.equals("end"));
	}
}
