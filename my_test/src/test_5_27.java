import java.util.Scanner; // 导入Scanner类，使得我们可以在代码中使用Scanner类来读取输入

public class test_5_27 { // 定义名为TestVar12的公共类
    public static void main(String[] args) { // 定义主方法main，程序的入口点
        Scanner sc = new Scanner(System.in); // 创建Scanner对象sc，用于从标准输入流System.in中读取输入

        // 键盘录入年龄：(接收 int 类型数据)
        System.out.print("请录入年龄："); // 输出提示信息，提示用户录入年龄
        int age = sc.nextInt(); // 使用nextInt()方法从控制台读取整数类型的输入，并将其赋值给变量age

        // 键盘录入身高：(接收 double 类型数据)
        System.out.print("请录入身高："); // 输出提示信息，提示用户录入身高
        double height = sc.nextDouble(); // 使用nextDouble()方法从控制台读取双精度浮点类型的输入，并将其赋值给变量height

        // 键盘录入姓名：(接收 String 类型数据--》字符串)
        System.out.print("请录入姓名："); // 输出提示信息，提示用户录入姓名
        String name = sc.next(); // 使用next()方法从控制台读取字符串类型的输入，并将其赋值给变量name

        // 键盘录入性别：(接收 char 类型)
        System.out.print("请录入性别："); // 输出提示信息，提示用户录入性别
        char sex = sc.next().charAt(0); // 使用next()方法从控制台读取字符串类型的输入，并通过charAt(0)方法获取字符串的第一个字符，赋值给变量sex

        // 输出学生信息
        System.out.println("该学生的信息为：姓名是：" + name + "，年龄是：" + age + "，身高为：" + height + "，性别是：" + sex); // 输出学生的信息，使用字符串拼接的方式将变量的值输出到控制台
        sc.close();
    }
    
}
