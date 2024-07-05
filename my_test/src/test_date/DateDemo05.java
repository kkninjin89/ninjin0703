package test_date;
import java.util.Date;
import java.util.Locale;
public class DateDemo05 {
	 public static void main(String[] args) {
	       Date date=new Date();                                      
	        //b的使用，月份简称  
	        String str=String.format(Locale.US,"英文月份简称：%tb",date);       
	        System.out.println(str);                                                                              
	        System.out.printf("本地月份简称：%tb%n",date);  
	        //B的使用，月份全称  
	       str = String.format(Locale.US, "英文月份的全称 %tB%n", date);
	       System.out.printf(str);
	       System.out.printf("本地月份全称：%tB%n",date);
	        //a的使用，星期简称  
	        str = String.format(Locale.US,"英文星期的简称：%ta%n",date);
	        System.out.printf(str);
	        //A的使用，星期全称  
	        str = String.format(Locale.US,"英文星期的全称：%tA%n",date);
	        System.out.printf(str);
	        //A，a的使用
	        System.out.printf("本地星期简称：%ta%n",date);
	        System.out.printf("本地星期全称：%tA%n",date);
	        //C的使用，年前两位  
	        System.out.printf("年的前两位数字，不足两位的前面补零：%tC%n",date);
	     
	        //y的使用，年后两位  
	        System.out.printf("年的后两位数字：%ty%n",date);
	        //j的使用，一年的天数  
	        System.out.printf("一年中的第几天：%tj%n",date);
	        //m的使用，月份 ，不足两位的补零 
	       System.out.printf("两位数的月份：%tm%n",date);
	        //d的使用，日（二位，不够补零）  
	       System.out.printf("两位数的日：%td%n",date);
	        //e的使用，日（一位不补零）  
	       System.out.printf("不补零的日：%te%n",date);
	}
}
