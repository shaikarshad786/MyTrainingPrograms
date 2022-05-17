package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
	
	public static Stream<Integer> changeListToStream(List<Integer> numbers){
		Stream<Integer> listToStream=numbers.stream();
		return listToStream;
	}
	
	public static List<String> changeStreamToList(Stream<String> name){
		List<String> streamToList=name.filter(n->n.startsWith("A")|| n.startsWith("M")).collect(Collectors.toList());
		return streamToList;
	}
	
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(20);
		list.add(30);
		list.add(14);
		list.add(11);
		Stream<Integer> stream=changeListToStream(list);
		stream.forEach(n->System.out.println(n));
		List<String> list1=new ArrayList<>();
		list1.add("apple");
		list1.add("Android");
		list1.add("Micromax");
		list1.add("Samsung");
		List<String> l=changeStreamToList(list1.stream());
		l.forEach(a->System.out.println(a));
		
	}

}
