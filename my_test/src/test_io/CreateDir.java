//创建目录


package test_io;
import java.io.File;
public class CreateDir {
	public static void main(String[] args) {
		String dirname = "D:/tmp/user/java/bin";
		File file = new File(dirname);
		
		file.mkdirs();
	}
}
