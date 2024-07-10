package teeeeessssttt;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class Five {
	public static void main(String[] args) {
		try {
			
			BufferedOutputStream bf = new BufferedOutputStream
					(new FileOutputStream("C:/Users/nkhar/Desktop/java3.txt"));
			
			
			byte b1 = 74; //ASCII：(J)
            byte b2 = 65; //ASCII：(A)
            byte b3 = 86; //ASCII：(V)
            byte b4 = 65; //ASCII：(A)
            
            bf.write(b1);
            bf.write(b2);
            bf.write(b3);
            bf.write(b4);
            
            bf.flush();
            
            bf.close();
            
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
