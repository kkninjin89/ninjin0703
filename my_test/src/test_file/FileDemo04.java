
package test_file;
import java.io.File;
public class FileDemo04 {
	public static void main(String[] args) {
		//renameTo()方法
		File oldFile = new File("D:/path/to/old_file.txt");
		File newfFile = new File("D:/path/to/new_file.txt");
		
		boolean result = oldFile.renameTo(newfFile);
		System.out.println("重命名为：" + result);
		
		//setLastModified
		
		File modifiedFile = new File("D:/path/to/mfile.txt");
		boolean result1 = modifiedFile.setLastModified(System.currentTimeMillis());
		System.out.println("最后一次修改的时间： " + result1);
	}
}