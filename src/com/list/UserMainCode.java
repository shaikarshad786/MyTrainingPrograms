package com.list;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMainCode {
	static ArrayList<Integer> generateOddEvenList(ArrayList<Integer>a,ArrayList<Integer>b){
		
		ArrayList<Integer> aryList=new ArrayList<>();
		for (int i=0;i<a.size();i++) {
			if (i%2==0) {
				aryList.add(b.get(i));
				}
			else {
				aryList.add(a.get(i));
			}
		}
		
		return aryList;
		
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=

	}

}
