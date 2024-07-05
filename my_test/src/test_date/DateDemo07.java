package test_date;
import java.util.Date;
public class DateDemo07 {
	public static void main(String[] args) {
		try {
			System.out.println(new Date()+"\n");
			Thread.sleep(1000*3);
			System.out.println(new Date()+"\n");
		} catch (Exception e) {
			System.out.println("got an exception!");
			// TODO: handle exception
		}
	}
}
