//replaceFirst 和 replaceAll 方法

package test_regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexDemo05 {
	private static String REGEX = "dog";
	private static String INPUT = "The dog says meow."+
									"All the dog say meow";
	private static String REPLACE = "cat";
	
	private static String INPUT1 ="";
	
	public static void main(String[] args) {
		Pattern p = Pattern.compile(REGEX);
		Matcher m = p.matcher(INPUT);
		INPUT = m.replaceAll(REPLACE);
		System.out.print("替换了全部dog： ");
		System.out.println(INPUT);
		
		INPUT1 = m.replaceFirst(REPLACE);
		System.out.print("只替换了第一个dog： ");
		System.out.println(INPUT1);
	}
}
