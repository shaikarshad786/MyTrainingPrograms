package com.list_programs;

import java.util.ArrayList;
import java.util.List;

public class ListOfOperation {
	public ArrayList <Integer> makeArrayListInt(int n){
		ArrayList<Integer> l=new ArrayList<>();
		for(int i=0;i<n;i++) {
		    l.add(0);
		}
		
		return l;
		
	}
	public static void main(String[] args) {
		ListOfOperation l1=new ListOfOperation();
		List<Integer>l2= l1.makeArrayListInt(4);
		System.out.println(l2);
	}
}
