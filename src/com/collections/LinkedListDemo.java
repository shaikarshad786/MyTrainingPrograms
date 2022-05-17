package com.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> courses = new LinkedList<>();
		courses.add("java");
		courses.add("html");
		courses.add("javascript");
		courses.add("java");
		courses.add("java");
		
		Iterator<String> i=courses.iterator();
		while (i.hasNext()) {
			String result=i.next();
			System.out.println(result);
		}
	}

}
