package com.lambdaExp;

import java.util.Scanner;

public class ValidateUtility {
	public static Validate validateEmployeeName() {
		Validate eValid=(name)->{if(name.matches("[a-zA-z\\s]{5,20}")) {
			return true;
		}
		else {
		
		return false;
		}
		};
		return eValid;
	}
	public static Validate validateProductName() {
		Validate pValid=(name1)->{if (name1.matches("[a-zA-Z]{1}[0-9]{5}")) {
			return true;
	}
		else {
			return false;
		}
};
		return pValid;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Name");
		Validate v1=validateEmployeeName();
//		v1.validName(sc.next());
		System.out.println(v1.validName(sc.nextLine()));
		System.out.println("Enter Product Name");
		Validate v2=validateProductName();
//		v2.validName(sc.next());
		System.out.println(v2.validName(sc.nextLine()));
		sc.close();
	}
}