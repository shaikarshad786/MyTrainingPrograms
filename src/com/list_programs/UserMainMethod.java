package com.list_programs;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMainMethod {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter No: of admissions");
		int noOfAdmissions=Integer.parseInt(scan.nextLine());
		ArrayList<Integer> ary1=new ArrayList<>();
		System.out.println("No: of admissions according to their year is:");
		for(int i=0;i<noOfAdmissions*2;i++) {
			ary1.add(Integer.parseInt(scan.nextLine()));
		}
		System.out.println("Maximum admissions are in:"+UserMainCode.getYear(ary1));
	}

}
