package data_structure;
import java.util.HashMap;
public class HashMapDemo02 {

	public static void main(String[] args) {
		HashMap<Integer, String> sites = new HashMap<Integer, String>();
		sites.put(1, "google");
		sites.put(2, "Runoob");
	    sites.put(3, "Taobao");
	    
	    System.out.println("sites HashMap: " + sites);
	    
	    //getOrDefault()方法 
	    //hashmap.getOrDefault(Object key, V defaultValue)
	    String v1 = sites.getOrDefault(1, "not found");
	    System.out.println("Value for key 1:  "+v1);
	    
	    String v2 = sites.getOrDefault(4, "not found");
	    System.out.println("Value for key 2:  "+v2);
	    
	    
	    //putIfAbsent方法
	    sites.putIfAbsent(4, "wiki");
	    System.out.println(sites);
	    
	    System.out.println("--------------------------------------------------------");
	    System.out.println("putIfAbsent方法:");
	    
	    //再创建一个HashMap
	    HashMap<String, Integer> prices = new HashMap<String, Integer>();
	    prices.put("shoes", 180);
	    prices.put("Bag", 300);
        prices.put("Pant", 150);
        System.out.println("normal price:  "+ prices);
        
        System.out.println("dicounted price:  ");
        
        //forEach方法
        prices.forEach((key,value)->{
        	value = value-value*10/100;
        	System.out.print(key+"="+value+" ");
        });
        System.out.println();
        System.out.println("--------------------------------------------------------");
        System.out.println("computeIfAbsent方法:");
        
        //方法：hashmap.computeIfAbsent(K key, Function remappingFunction)
        
        int shirtPrice=prices.computeIfAbsent("shirt",key ->280);
        System.out.println("price of shirt "+shirtPrice);
        System.out.println("updated prices:"+ prices);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
