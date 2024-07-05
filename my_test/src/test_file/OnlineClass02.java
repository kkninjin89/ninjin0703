package test_file;
import java.io.File;
import java.io.IOException;
public class OnlineClass02 {
	public static void main(String[] args) throws IOException {
		File file = new File("D:/path/to/file12.txt");
		//create()方法
		if (file.createNewFile()) {
			System.out.println("创建文件成功");
		} else {
			System.out.println("创建文件失败");
		}
		
		System.out.println("-----------------------");
		
		//mkdirs()方法
		File dirFile = new File("D:/path/testfordir/dir1");
		dirFile.mkdir();
		
	}
}
