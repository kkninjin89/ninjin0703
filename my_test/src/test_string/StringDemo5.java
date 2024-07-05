package test_string;

public class StringDemo5 {
	public static void main(String args[]) {
        String str1 = "Strings";
        String str2 = "Strings";
        String str3 = "Strings123";
        String str4 = "STRINGS";
        String str5 = "STRINGSSSS";
        int result = str1.compareTo(str2);
        int result2 = str1.compareTo(str3);
        int result3 = str2.compareTo(str3);
        int result4 = str1.compareTo(str4);
        int result5 = str4.compareToIgnoreCase(str1);
        int result6 = str5.compareTo(str1);
        
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
}
}