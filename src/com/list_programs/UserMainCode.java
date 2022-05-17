package com.list_programs;

import java.util.ArrayList;

public class UserMainCode {
	
	static Integer getYear(ArrayList <Integer> ary){
		int year=0;
		int max=0;
		for(int i=1;i<ary.size();i++) {
		int x=ary.get(i);
		max=x;
		year=ary.get(i-1);
		}
		return year;	
	}
	
}
