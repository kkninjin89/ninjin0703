import java.util.Scanner;
public class test_remainder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个四位数：");
		int num = sc.nextInt();
		//个位数
		int num1 = num%10;
		//十位数
		int num2 = num/10%10;
		//百位数
		int num3 = num/100%10;
		//千位数
		int num4 = num/1000;
		//输出每位上的数字：
		System.out.println("个位上的数字为："+num1);
		System.out.println("十位上的数字为："+num2);
		System.out.println("百位上的数字为："+num3);
		System.out.println("千位上的数字为："+num4);
	}
}