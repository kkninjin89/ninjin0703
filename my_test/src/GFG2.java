import java.util.Arrays;
public class GFG2 {
	 public static void main(String[] args)
	    {
	 
	        // create a StringBuffer object
	        // with a String pass as parameter
	        StringBuffer
	            str
	            = new StringBuffer("Contribute Geeks");
	 
	        // create a char Array
	        char[] array = new char[10];
	 
	        // initialize all character to $(dollar sign).
	        Arrays.fill(array, '$');
	        for(int i = 0;i<=array.length; i++) {
	        	System.out.print(array[i]+"");
	        	
	        }
	        try {
	 
	            // if start is greater then end
	            str.getChars(2, 1, array, 0);
	        }
	 
	        catch (Exception e) {
	            System.out.println("Exception: " + e);
	        }
	    }
}
