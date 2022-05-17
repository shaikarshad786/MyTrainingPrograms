package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		//we need to specify what type of object we passing<String> 
		ArrayList<String> courses = new ArrayList<>();
        courses.add("Java");
        courses.add("c++");
		courses.add("Html");
		courses.add("java script");
		courses.add("sql");
		courses.add("java");
		
		Iterator<String> i=courses.iterator();
		while (i.hasNext()) {
			String st=i.next();
			System.out.println(st);
		}
	}

}
