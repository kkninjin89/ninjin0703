/*appendReplacement 和 appendTail 方法通常与 Matcher 类的 find 方法一起使用，用于在替换过程中处理匹配结果。

appendReplacement 方法
StringBuffer appendReplacement(StringBuffer sb, String replacement)
Matcher 类的方法，用于将匹配部分替换为指定的替换字符串，并将替换结果追加到 StringBuffer 对象中。
通常在循环中使用，用于替换每个匹配部分。
appendTail 方法
StringBuffer appendTail(StringBuffer sb)
Matcher 类的方法，用于将替换操作完成后剩余的输入字符串追加到 StringBuffer 对象中。
通常在循环结束后调用，用于追加替换操作未涉及的剩余部分。
*/

package test_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo06 {
	
	private static String REGEX = "a*b";
	private static String INPUT = "aabfooaabfooabfoobkkk";
	private static String REPLACE ="-";
	
	public static void main(String[] args) {
		
	Pattern p = Pattern.compile(REGEX);
	Matcher m = p.matcher(INPUT);
	
	StringBuffer sb = new StringBuffer();
	
	while(m.find()) {
		m.appendReplacement(sb, REPLACE);
	}
	m.appendTail(sb);
	System.out.println(sb.toString());
	}
}
