package test_file;
import java.io.File;
public class FileDemo05 {
	public static void main(String[] args) {
		//setLastModified
		File modifiedFile = new File("D:/path/to/mfile.txt");
			
		boolean result1 = modifiedFile.setLastModified(System.currentTimeMillis());
		System.out.println("最后一次修改的时间： " + result1);
			
		//使用 File.createTempFile() 方法创建临时文件时，
		//系统会自动为文件名添加一个随机生成的唯一标识符，通常是一个长串的数字。
		//这个唯一标识符是为了确保在同一目录下不会有重复的临时文件名，从而避免文件名冲突。		
		try {
			File tempFile = File.createTempFile("prefix_",".txt",new File("D:/path/to/directory"));
			System.out.println("临时文件为： "+tempFile.getAbsolutePath() );
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
