package teeeeessssttt;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ten {
 public static void main(String[] args) {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	try {
		String str = reader.readLine();
		System.out.println(str);
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}
