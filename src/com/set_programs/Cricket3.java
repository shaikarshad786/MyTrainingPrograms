package com.set_programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Cricket3 {
	Set<String>getListOfPlayers(List<String>list1){
		Set<String>s=list1.stream().collect(Collectors.toSet());
		return s;
	}
	Set<String>getListOfPlayers1(List<String>list2){
		Set<String>s1=list2.stream().collect(Collectors.toSet());
		return s1;
	}
	public static void main(String[] args) {
		Cricket3 cricket=new Cricket3();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of best bowlers in season 4");
		int topRunScorers4=Integer.parseInt(scan.nextLine());
		System.out.println("Enter the names of players");
		List<String>list=new ArrayList<>();
		Set<String>set=cricket.getListOfPlayers(list);
		for(int i=0;i<topRunScorers4;i++) {
			set.add(scan.nextLine());
		}
		System.out.println("Enter number of best bowlers in season 5");
		int topRunScorers5=Integer.parseInt(scan.nextLine());
		Set<String>set1=cricket.getListOfPlayers1(list);
		for(int i=0;i<topRunScorers5;i++) {
			set1.add(scan.nextLine());
		}
		set1.addAll(set1);
		System.out.println(set1);
}
}
