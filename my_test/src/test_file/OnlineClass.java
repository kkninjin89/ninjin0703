package test_file;

import java.io.File;

public class OnlineClass {
	public static void main(String[] args) {
		
		File file = new File("D:/path/to/file.txt");
		//确认是否存在
		if (file.exists()) {
			System.out.println("此文件存在");
		} else {
			System.out.println("此文件不存在");
		}
	}
}