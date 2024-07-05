package test_calendar;
import java.util.Calendar;
public class CalendarDemo01 {
	public static void main(String[] args) {
        // 创建一个代表2009年6月12日的Calendar对象
        Calendar c1 = Calendar.getInstance();
        
        /*Java Calendar类中定义了一组静态常量来表示月份，
         * 比如Calendar.JANUARY、Calendar.FEBRUARY，等等。
         * 这些常量可以使代码更具可读性，避免减一操作。*/
        c1.set(2009, Calendar.JUNE, 12);

        // 输出该日期
        System.out.println("c1:"+c1.getTime());
        
        
        Calendar c2 = Calendar.getInstance();
        c2.set(2009, 6-1, 12);
        System.out.println("c2:"+c2.getTime());
        
        
        Calendar c3 = Calendar.getInstance();
        c3.set(Calendar.DATE,10);
        System.out.println("c3:"+c3.getTime());
        
        
        Calendar c4 = Calendar.getInstance();
        c4.set(Calendar.YEAR,2010);
        System.out.println("c4:"+c4.getTime());
    }
}