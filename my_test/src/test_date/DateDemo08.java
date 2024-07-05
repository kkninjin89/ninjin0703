//测量时间

package test_date;
import java.util.Date;
public class DateDemo08 {
	public static void main(String[] args) {
	      try {
	    	  Long start = System.currentTimeMillis();
	    	  System.out.println(new Date()+"\n");
	    	  Thread.sleep(3*1000);
	    	  
	    	  System.out.println(new Date()+"\n");
	    	  long end = System.currentTimeMillis();
	    	  
	    	  long diff = end - start;
	    	  
	    	  System.out.println("difference is:"+ diff);
	      } 
	      
	      catch (Exception e) {
	    	  System.out.println("got an exception!");
	      }  
	}
}