package com.list_programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fruit {
	public static void main(String[] args) {
		List<String>list1= new ArrayList(Arrays.asList("apple","grapes","melon"));
		list1.removeIf(n->(n.charAt(0)=='a'|| n.charAt(0)=='g'));
		List<String>list2=new ArrayList(Arrays.asList("apple","mango","melon"));;
	    list2.removeIf(n->(n.charAt(n.length()-1)=='n'||n.charAt(n.length()-1)=='e'));
		System.out.println(list1);
		System.out.println(list2);
	}	
	
}
