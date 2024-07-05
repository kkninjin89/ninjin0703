import java.util.Arrays; 
class GFG3{
	public static void main(String[] args) { 
  
        // create a StringBuilder object 
        // with a String pass as parameter 
        StringBuilder str = new StringBuilder("evil dead_01"); 
  
        // print string 
        System.out.println("String = "
                           + str.toString());
        
        //create a char Array
        char[] array = new char[10];
        
        //将数组填充为下划线
        Arrays.fill(array, '_');
        //打印原始数组
        System.out.print("原始数组包含：");
        
        for(int i=0;i<array.length;i++)
        System.out.print(array[i]+"");
        System.out.println();
        //使用getchar方法
        str.getChars(5, 9, array, 3);
        
        //打印改变之后的数组
        
        System.out.print("数组包含：");
        for(int i=0;i < array.length;i++) {
        	System.out.print(array[i]+"");
        }
}
}
