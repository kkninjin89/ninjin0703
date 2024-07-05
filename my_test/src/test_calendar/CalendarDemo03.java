//add方法的使用

package test_calendar;
import java.util.Calendar; 
public class CalendarDemo03 {
	public static void main(String[] args) {
		Calendar c1 = Calendar.getInstance();
		System.out.println("current time :"+ c1.getTime());
		
		
		
		System.out.println();
		 // 在当前日期上减去12天
        c1.add(Calendar.DATE, -12);
        System.out.println("After subtracting 12 days: " + c1.getTime());
        System.out.println();
		//在当前日期加上5天
		c1.add(Calendar.DAY_OF_MONTH, 5);
		System.out.println("after adding 5 days: "+ c1.getTime());
		
		//在当前日期减2个月
		c1.add(Calendar.MONTH, -2);
		System.out.println("after subtracting 2 months: "+ c1.getTime());
		
		//在当前日期加三年
		c1.add(Calendar.YEAR, 3);
		System.out.println("after adding 3 years: "+ c1.getTime());
		
		
	}
}
