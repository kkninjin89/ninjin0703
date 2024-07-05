package test_file;
import java.io.File;
public class FileDemo06 {
	public static void main(String[] args)throws Exception {
		File temp = File.createTempFile("testrunoobtmp", ".txt");
		System.out.println("文件的绝对路径为： " + temp.getAbsolutePath());
	}

}
