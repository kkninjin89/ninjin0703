import java.io.File;

public class MyGitTest3 {
String string1="abcdefg";
String string2="cdefghi";
public static void main(String[] args) {
		
		File file = new File("D:/path/to/file.txt");
		//确认是否存在
		if (file.exists()) {
			System.out.println("此文件存在");
		} else {
			System.out.println("此文件不存在");
		}
		System.out.println("yeah!");
	}
}
