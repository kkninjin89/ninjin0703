//捕获组 group()方法
package test_regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo02 {
	public static void main(String[] args) {
		String line = "this order was placed for QT3000! ok?";
		String pattern ="(\\D*)(\\d+)(.*)";
		
		//创建pattern对象
		Pattern p = Pattern.compile(pattern);
			
		
		//创建matcher对象
		Matcher m = p.matcher(line);
		m.find();
			System.out.println("found value: " +m.group(0));
			System.out.println("found value: " +m.group(1));
			System.out.println("found value: " +m.group(2));
			System.out.println("found value: " +m.group(3));
		
	}
}
