//Matcher类的索引方法；start 和 end 方法


package test_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo03 {
	
	private static final String REGEX = "\\bcat\\b";
	private static final String INPUT = "cat cat cat cattie cat";
	
	
	public static void main(String[] args) {
		Pattern p = Pattern.compile(REGEX);
		Matcher m = p.matcher(INPUT);
		
		int count = 0;
		
		while (m.find()) {
			count++;
			System.out.println("match number "+ count);
			System.out.println("start():" +m.start());
			System.out.println("end():"+m.end());
			
		}
	}
}
