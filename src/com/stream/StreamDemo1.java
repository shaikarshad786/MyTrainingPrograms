package com.stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamDemo1 {

	public static Stream<Integer> changeListToStream(List<Integer> numbers){
		Stream<Integer> streamOfNumber=numbers.stream();
		return streamOfNumber;
	}
	public static Set<Integer> filterNumberIntoSet(List<Integer> number){
		Set<Integer> set1=number.stream().filter(num->num>=35).map(n->n).collect(Collectors.toSet());
		return set1;
	}
	public static int countPassNumberForMarksList(List<Integer> numbers) {
		int totalCountOfPassStudents=(int) numbers.stream().filter(num->num>=60).map(num->num).count();
		return totalCountOfPassStudents;
	}
	public static List<Integer> addGraceMarks(List<Integer> marks){
		List<Integer> listOfMarks=marks.stream().filter(n->n>=55).map(n->n+5).collect(Collectors.toList());
		return listOfMarks;
	}
	public static int getMaxMarks(Collection<Integer> marks) {
		int maxMarks=marks.stream().max((a,b)->a>b ? 1:-1).get();
		return maxMarks;
	}
	public static List<Integer> sortMarks(List<Integer> marks){
		List<Integer> sortedMarks=marks.stream().sorted((p,q)->p.compareTo(q)).collect(Collectors.toList());
		return sortedMarks;
	}
	public static void main(String[] args) {
		List<Integer> listOfNumber=new ArrayList<>();
		listOfNumber.add(101);
		listOfNumber.add(20);
		listOfNumber.add(111);
		listOfNumber.add(123);
		listOfNumber.add(1);
		Stream<Integer> s=changeListToStream(listOfNumber);
		s.forEach(n->System.out.println(n));
		System.out.println("**********");
		Set<Integer>s1=filterNumberIntoSet(listOfNumber);
		s1.forEach(n->System.out.println(n));
		System.out.println("***********");
		int s2=countPassNumberForMarksList(listOfNumber);
		System.out.println(s2);
		System.out.println("***********");
		List<Integer>s3=addGraceMarks(listOfNumber);
		s3.forEach(n->System.out.println(n));
		System.out.println("*************");
		int s4=getMaxMarks(listOfNumber);
		System.out.println(s4);
		System.out.println("**************");
		List<Integer>s5=sortMarks(listOfNumber);
		System.out.println(s5);
		
	}

}
