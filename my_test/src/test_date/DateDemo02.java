package test_date;
import java.util.Date;
public class DateDemo02 {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println("2023-02-24 13:34:45 GMT+08:00");
		System.out.printf("%tY-%tm-%td %tH:%tM:%tS  %tZ",date,date,date,date,date,date,date);
	}
}