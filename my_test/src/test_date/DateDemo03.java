package test_date;
import java.util.Date;
import java.util.Locale;
public class DateDemo03 {
	public static void main(String[] args) {
	//初始化对象
	Date date = new Date();
//c的使用 包含全部日期时间信息
	System.out.printf("%tc%n",date);
//F的使用 年月日
	System.out.printf("%tF%n",date);
//D的使用 月日年
	System.out.printf("%tD%n",date);
//r的使用 "HH:MM:SS PM"格式（12时制）	
	System.out.printf("%tr%n",date);
//T的使用 "HH:MM:SS"格式（24时制）
	System.out.printf("%tT%n",date);
//R的使用 "HH:MM"格式（24时制）
	System.out.printf("%tR%n",date);
//e的使用
	System.out.printf("%te%n",date);
//用string。format方法改成英文的
	String str = String.format(Locale.US,"英文月份全称：%tB", date);
	System.out.printf(str);
	}
}
	
