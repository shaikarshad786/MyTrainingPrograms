package com.stream;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamDemo3 {

	public static List<String> getBookBasedOnBookName(HashMap<String,String>books){
		List<String> s= books.entrySet().stream().filter(e->e.getKey().startsWith("978.0")).map(Map.Entry::getValue).collect(Collectors.toList());
		return s;
	}
	
	
	public static void main(String[] args) {
		HashMap<String,String>books=new HashMap<>();
		books.put("978.02016", "Design patterns");
		books.put("978.16172", "Java 8 in action");
		books.put("978.013468", "Effective Java");
		System.out.println(getBookBasedOnBookName(books));
	}

}
