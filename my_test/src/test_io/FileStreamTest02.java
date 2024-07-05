package test_io;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FileStreamTest02 {

	public static void main(String[] args) throws IOException{
		//写入文件部分
		File file = new File("a.txt");
		FileOutputStream fOutputStream = new FileOutputStream(file);
		OutputStreamWriter writer = new OutputStreamWriter(fOutputStream,"UTF-8");
		
		writer.append("中文输入");
		writer.append("\r\n");
		writer.append("English");
		
		writer.close();
		fOutputStream.close();
		
		//读取文件部分
		FileInputStream fInputStream = new FileInputStream(file);
		InputStreamReader reader = new InputStreamReader(fInputStream,"UTF-8");
		
		StringBuffer sb = new StringBuffer();
		
		while (reader.ready()) {
			// 转成char加到StringBuffer对象中
			sb.append((char)reader.read());
		}
		System.out.println(sb.toString());
		reader.close();
		fInputStream.close();
	}
}
