package test_file;
import java.io.File;
import java.io.FilenameFilter;
public class FileDemo03 {
	public static void main(String[] args) {
		//list()方法
		File dir = new File("D:/path/to/");
		String[] files = dir.list();
		
		if (files !=null) {
			for (String file : files) {
				System.out.println(file);
			}
		}
		
		System.out.println("---------------------------------------");
		
		//list(FilenameFilter filter)
		FilenameFilter filter = new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith(".txt");
			}
		};
		
		String[] files1 = dir.list(filter);
		
		if (files1 !=null) {
			for (String fiString : files1) {
				System.out.println(fiString);
			}
		}
	}
}