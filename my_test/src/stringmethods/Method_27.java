package stringmethods;

public class Method_27 {
	public static void main(String[] args) {
        String str1 = "HelloWorld!";
        String str2 = "helloporld!";
        boolean result = str1.regionMatches(true,0, str2, 0, 6);
        System.out.println(result); // 输出: true
    }
}
