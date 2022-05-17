package com.lambdaExp;
@FunctionalInterface
public interface CustomerService {
	boolean login(String userName,String password);
	default void display() {
		System.out.println("Hi");
	}
}
