package teeeeessssttt;
import java.io.File;
import java.io.FileReader;
public class One {
	
		public static void main(String[] args) {
			try {
				File file = new File("C:/Users/nkhar/Desktop/java.txt");
				
				if (file.exists()) {
					
					FileReader fileReader = new FileReader(file);
					
					int data;
					
					while ((data = fileReader.read())!=-1) {
						System.out.print((char)data);
					}
					
					fileReader.close();
				} else {
					System.out.println("file不存在");
				}
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
}
