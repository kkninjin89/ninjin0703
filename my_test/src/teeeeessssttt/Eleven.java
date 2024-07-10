package teeeeessssttt;
import java.nio.charset.StandardCharsets;
public class Eleven {
 public static void main(String[] args) {
	//byte->String
	 byte[] sbyte = "apple".getBytes(StandardCharsets.UTF_8);
	 
	 String str = new String(sbyte);
	 
	 System.out.println("str: "+str);
	 
	 //String->byte
	 
	 String str1 = "apple";
	 
	 byte[] sbyte1 = str1.getBytes();
	 
	 for (int i = 0; i < sbyte1.length; i++) {
		System.out.println(sbyte1[i]);
		
	}
}
}
