package com.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo4 {
	
	public static int countEmptyString(List<String> listOfString) {
		int a=(int)listOfString.stream().filter(n->n.isEmpty()).map(n->n).count();
		return a;
	}
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("");
		list.add("admin");
		list.add("user");
		list.add("");
		list.add("");
		int l1=countEmptyString(list);
		System.out.println(l1);
	}

}
