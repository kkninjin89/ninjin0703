//非捕获组？：

package test_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegexDemo09 {

	public static final String P_UNCAPTURED =
									"(\\d{4})-((?:\\d{2})-(\\d{2}))";
	public static final String Date_STRING = "2024-06-13";
	
	public static void main(String[] args) {
		Pattern p = Pattern.compile(P_UNCAPTURED);
		Matcher m = p.matcher(Date_STRING);
		
		//m.group(0) 表示整个匹配到的字符串，不计入 groupCount 的数量
		
		System.out.print("共有捕获组为：");
		System.out.println(m.groupCount());
		
		m.find();
			System.out.println("第一个： "+ m.group(0));
			System.out.println("第二个： "+ m.group(1));
			System.out.println("第三个： "+ m.group(2));
			System.out.println("第四个： "+ m.group(3));
		
	}
}
