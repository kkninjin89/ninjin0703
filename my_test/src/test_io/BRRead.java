//使用 BufferedReader 在控制台读取字符


package test_io;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BRRead {
	public static void main(String[] args) throws IOException{
		char c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("请输入字符，按'q'键退出。");
		
		//读取字符
		
		do {
			c= (char) br.read();
			System.out.println(c);
		} while (c!='q');
	}
}