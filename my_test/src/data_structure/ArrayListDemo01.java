package data_structure;

import java.util.ArrayList;

public class ArrayListDemo01 {
	public static void main(String[] args) {
		//创建一个动态数组
		ArrayList<String> sites = new ArrayList<String>();
			sites.add("google");
			sites.add("runoob");
			sites.add("taobao");
			sites.add("yahoo");
			sites.add("baidu");
			System.out.println("ArrayList1:"+ sites);
		//创建另一个动态数组
			ArrayList<String> sites2 = new ArrayList<String>();
			sites2.add("wiki");
			sites2.add("runoob");
			sites2.add("google");
			System.out.println("ArrayList2:"+sites2);
			
			//使用retain()方法保留元素
			sites.retainAll(sites2);
			System.out.println("保留的元素：" +sites);
			
			ArrayList<String> sites3 = new ArrayList<String>();
			sites3.add("google");
			sites3.add("runoob");
			sites3.add("taobao");
			sites3.add("yahoo");
			sites3.add("baidu");
			System.out.println("ArrayList3:"+ sites3);
			
			sites3.removeIf(e->e.contains("tao"));
			System.out.println("删除后的ArrayList3: "+sites3);
		
	}
}
