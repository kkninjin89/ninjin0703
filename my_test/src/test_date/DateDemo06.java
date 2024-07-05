package test_date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DateDemo06 {
	public static void main(String[] args) {
		SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
		
		String input = args.length == 0 ? "1888-11-11":args[0];
		
		System.out.print(input+"parses as");
		
		Date t;
		try {
			t = ft.parse(input);
			System.out.println(t);
		} catch (ParseException e) {
			System.out.println("Unparseable using " + ft);
			// TODO: handle exception
		}
	}
	
}