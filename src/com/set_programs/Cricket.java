package com.set_programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Cricket {
	Set<String>getListOfPlayers(List<String>list1){
		Set<String>s=list1.stream().collect(Collectors.toSet());
		return s;
	}
	Set<String>getListOfPlayers1(List<String>list2){
		Set<String>s1=list2.stream().collect(Collectors.toSet());
		return s1;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		List<String>list=new ArrayList<String>();
		Cricket cricket=new Cricket();
		System.out.println("Enter the number of top run scorers in season 4");
		int topRunScorers4=Integer.parseInt(scan.nextLine());
		System.out.println("Enter the name of players");
		Set<String> set1=cricket.getListOfPlayers(list);
		for(int i=0;i<topRunScorers4;i++) {
			set1.add(scan.nextLine());
		}
		System.out.println("Enter the number of top run scorers in season 5");
		int topRunScorers5=Integer.parseInt(scan.nextLine());
		System.out.println("Enter the name of players");
		Set<String> set2=cricket.getListOfPlayers1(list);
		for(int i=0;i<topRunScorers5;i++) {
			set2.add(scan.nextLine());
		}
		System.out.println("union");
		set1.addAll(set2);
		System.out.println(set1);
		System.out.println("**********************************");
		System.out.println("Intersection");
		System.out.println("Enter the number of top run scorers in season 4");
		int topRunScorers=Integer.parseInt(scan.nextLine());
		System.out.println("Enter the name of players");
		Set<String> s=cricket.getListOfPlayers(list);
		for(int i=0;i<topRunScorers;i++) {
			s.add(scan.nextLine());
		}
		System.out.println("Enter the number of top run scorers in season 5");
		int topRunScorers1=Integer.parseInt(scan.nextLine());
		System.out.println("Enter the name of players");
		Set<String> s1=cricket.getListOfPlayers1(list);
		for(int i=0;i<topRunScorers1;i++) {
			s1.add(scan.nextLine());
		}
		s.retainAll(s1);
		System.out.println(s);
		
	}
}
