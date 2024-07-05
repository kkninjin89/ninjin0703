
public class TestStringBuilder02 {
	public static void main(String args[]){
		StringBuilder sb1=new StringBuilder();
		System.out.println("容量："+sb1.capacity());

		StringBuilder sb2=new StringBuilder("12345");
		System.out.println("容量2："+sb2.capacity());

		StringBuilder sb3=new StringBuilder("1234567890");
		System.out.println("容量3："+sb3.capacity());
		
		StringBuilder sb4=new StringBuilder("aaa bbb ccc ddd eee");
		System.out.println("容量4："+sb4.capacity());
		
		StringBuilder sb = new StringBuilder(10);
        sb.append("Runoob..");
        System.out.println(sb);  
        System.out.println("容量a："+sb.capacity());
        
        sb.append("!");
        System.out.println(sb); 
        System.out.println("容量b："+sb.capacity());
        
        sb.insert(8, "Java");
        System.out.println(sb); 
        System.out.println("容量c："+sb.capacity());
        
        sb.delete(5,8);
        System.out.println(sb);  
        System.out.println("容量d："+sb.capacity());
    }
}
