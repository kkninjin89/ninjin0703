package data_structure;
import java.util.HashMap;
public class HashMapDemo01 {
	public static void main(String[] args) {
		HashMap<Integer, String> Sites= new HashMap<Integer, String>();
		
		Sites.put(1, "google");
		Sites.put(2, "runoob");
		Sites.put(3, "taobao");
		Sites.put(4, "zhihu");
		
		System.out.println(Sites);
		
		System.out.println(Sites.get(3));
		
		System.out.println(Sites.size());
		
		//用for迭代 
		for (Integer i : Sites.keySet()) {
			System.out.println("key:"+i+" "+"value:"+Sites.get(i));
		}
		
		 HashMap<Integer, String> Sites2 = new HashMap<>();
	        Sites2.put(1, "Weibo");  // 已存在会被替换
	        Sites2.put(4, "Wiki");
	        
	        Sites2.putAll(Sites);
	        System.out.println(Sites2);
	}
}
