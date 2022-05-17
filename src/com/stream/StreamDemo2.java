package com.stream;

import java.util.HashMap;

public class StreamDemo2 {
	public static int countNumberOfLocation(HashMap<Integer,String>emp) {
    int a=(int)emp.values().stream().distinct().count();
		return a;
		
	}
public static void main(String[] args) {
	HashMap<Integer,String>map=new HashMap<>();
	map.put(1,"Samsung");
	map.put(2,"Apple");
	map.put(3,"OnePlus");
	map.put(4,"Vivo");
	map.put(5,"OnePlus");
	System.out.println(countNumberOfLocation(map));
}
}
