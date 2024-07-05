package data_structure;
import java.util.LinkedList;

public class LinkedListDemo01 {
	public static void main(String[] args) {
		LinkedList<String> sites = new LinkedList<String>();
			sites.add("Google");
			sites.add("Runoob");
			sites.add("Taobao");
			sites.add("Weibo");
			for (String i : sites) {
				System.out.println(i);
			}
			
			
		String lastElement = sites.getLast();
        System.out.println("最后一个元素："+lastElement);
        
        String firstElement = sites.getFirst();
        System.out.println("第一个元素："+firstElement);
	}
}
