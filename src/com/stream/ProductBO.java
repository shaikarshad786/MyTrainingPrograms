package com.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


    enum SortMethod{BYPRICE,BYNAME};

    class Product {

	public static int getpCost;
	private String pName;
	private double pCost;
	
	
	
	public Product(String pName, double pCost) {
		super();
		this.pName = pName;
		this.pCost = pCost;
	}



	public Product() {
		super();
		
	}



	public String getpName() {
		return pName;
	}



	public void setpName(String pName) {
		this.pName = pName;
	}



	public double getpCost() {
		return pCost;
	}



	public void setpCost(double pCost) {
		this.pCost = pCost;
	}
}

public class ProductBO {

	public static double getTotalCost(List<Product> product) {
		double totalCost=product.stream().mapToDouble(Product::getpCost).sum();
		return totalCost;
	}
	
	public static Set<Product> getAllProducts(List<Product>product){
		Set<Product>allProducts=product.stream().filter(m->m.getpCost()>5000.00).map(m->m).collect(Collectors.toSet());
		return allProducts;
	}
	
	public static Stream<Product>sortProduct(List<Product> listOfProduct,SortMethod sort){
		String sortMethod=sort.name();
		if(sortMethod.equals("BYNAME")) {
			Comparator<Product> sortByName=(p1,p2)->p1.getpName().compareTo(p2.getpName())> 1 ? 1:-1;
			return listOfProduct.stream().sorted(sortByName);
		}
		else if(sortMethod.equals("BYPRICE")) {
			Comparator<Product> sortByPrice=(p1,p2)->p1.getpCost()>p2.getpCost() ?1:-1;
			return listOfProduct.stream().sorted(sortByPrice);
		}
		
		return null;
	}
	
	public static void main(String[] args) {
		List<Product> products=new ArrayList<Product>();
		products.add(new Product("ABC",540.00));
		products.add(new Product("DBC",440.00));
		products.add(new Product("EBC",567.00));
		products.add(new Product("AWBC",432.00));
		products.add(new Product("ABEC",654.00));
		
		Stream<Product>s1=ProductBO.sortProduct(products, SortMethod.BYPRICE);
		s1.forEach(n->System.out.println(n.getpName()+" "+n.getpCost()));
	}

}
