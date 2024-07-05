package data_structure;

import java.util.HashSet;

public class HashSetDemo01 {
public static void main(String[] args) {
	HashSet<String> sites = new HashSet<String>();
	sites.add("Google");
    sites.add("Runoob");
    sites.add("Taobao");
    sites.add("Zhihu");
    //重复的值不会被添加
    sites.add("Runoob");  
    System.out.println(sites);
    System.out.println(sites.contains("Taobao"));
}
}