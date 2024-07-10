package teeeeessssttt;
import java.io.FileOutputStream;
import java.io.IOException;

public class Six {
public static void main(String[] args)  throws IOException{
	
	FileOutputStream fos = 
			new FileOutputStream("C:/Users/nkhar/Desktop/java4.txt");
	
	
	byte b1 = 74; //ASCII：(J)
    byte b2 = 65; //ASCII：(A)
    byte b3 = 86; //ASCII：(V)
    byte b4 = 65; //ASCII：(A)
    
    
    fos.write(b1);
    fos.write(b2);
    fos.write(b3);
    fos.write(b4);
    
    fos.flush();
    
    fos.close();
}
}
