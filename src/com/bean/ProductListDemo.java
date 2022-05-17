package com.bean;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ProductListDemo {

	public static void main(String[] args) {
		Product p1=new Product();
		p1.setProductId(10);
		p1.setProductName("Samsung");
		p1.setProductPrice(1500);
		p1.setCategory("Head Phones");
		Product p2=new Product();
		p2.setProductId(20);
		p2.setProductName("IPhone");
		p2.setProductPrice(100000);
		p2.setCategory("Mobile");
		Product p3=new Product();
		p3.setProductId(30);
		p3.setProductName("Dell");
		p3.setProductPrice(48500);
		p3.setCategory("Laptop");
		//ArrayList<Product> products = new ArrayList<>();
		HashSet<Product> products =new HashSet<>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		
		Iterator<Product> i=products.iterator();
		while (i.hasNext()) {
			Product p=i.next();
			System.out.println(p.getProductId()+","+p.getProductName()+","+p.getProductPrice()+","+p.getCategory());
			
		}
	}

}
