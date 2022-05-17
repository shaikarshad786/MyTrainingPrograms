package com.abc;

public class EnumPizzaDemo {
	private int id;
	private double price; 
	private enum Size{SMALL,MEDIUM,LARGE}
	public EnumPizzaDemo(int id,double price)
	{
		this.id=id;
		this.price=price;
	}
    public void pizzaDetails()
    {
    	System.out.println("Pizza Id:"+id);
    	System.out.println("Pizza price:"+price);
    	System.out.println("Pizza size:"+Size.LARGE);
    }
}
