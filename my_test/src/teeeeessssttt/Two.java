package teeeeessssttt;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
public class Two {
	public static void main(String[] args) {
		try {
			FileInputStream fStream = new FileInputStream("C:/Users/nkhar/Desktop/java1.txt");
			InputStreamReader isr = new InputStreamReader(fStream,"UTF-8");
			 
			int data;
			while ((data = isr.read())!=-1) {
				System.out.println(data);
			}
			isr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
