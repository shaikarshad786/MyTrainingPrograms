package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList courses = new ArrayList();
		courses.add("java");
		courses.add("Html");
		courses.add("java script");
		courses.add("sql");
		courses.add("java");
		courses.add(3, "c++");
		boolean c = courses.contains("sql");
		// courses.addAll(courses);
		System.out.println(courses);
		System.out.println(c);
		// courses.addAll(2, courses);
		System.out.println(courses);
		courses.remove("java");
		System.out.println(courses);
		// traversing
		 //iterator or for each loop
		Iterator i = courses.iterator();
		while (i.hasNext()) {
			Object obj = i.next();
			String str = (String) obj;
			System.out.println(str.length());
		}
//		courses.add(new Integer(56));
//		courses.add(new Integer(96));
//		courses.add(new Integer(66));
//		courses.add(new Integer(46));
//		courses.add(new Integer(5226));
//		
//		Iterator i=courses.iterator();
//		
//		while (i.hasNext()) {
//			Object obj=i.next();
//			Integer j= (Integer)obj;
//			System.out.println(j.compareTo(j));
//		}
	}
}
