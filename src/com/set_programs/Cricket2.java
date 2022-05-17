package com.set_programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Cricket2 {
	Set<String>getListOfPlayers(List<String>list1){
		Set<String>s=list1.stream().collect(Collectors.toSet());
		return s;
	}
	Set<String>getListOfPlayers1(List<String>list2){
		Set<String>s1=list2.stream().collect(Collectors.toSet());
		return s1;
	}
	public static void main(String[] args) {
		Cricket2 cricket=new Cricket2();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of top run scorers in season 4");
		int topRunScorers4=Integer.parseInt(scan.nextLine());
		System.out.println("Enter the names of players");
		List<String>list=new ArrayList<>();
		Set<String>set=cricket.getListOfPlayers(list);
		for(int i=0;i<topRunScorers4;i++) {
			set.add(scan.nextLine());
		}
		System.out.println("Enter number of top run scorers in season 5");
		int topRunScorers5=Integer.parseInt(scan.nextLine());
		Set<String>set1=cricket.getListOfPlayers1(list);
		for(int i=0;i<topRunScorers5;i++) {
			set1.add(scan.nextLine());
		}
		System.out.println("Union");
		set.addAll(set1);
		for(String s:set) {
			System.out.println(s);
		}
		for(String s1:set1) {
			System.out.println(s1);
		}
	}
}
