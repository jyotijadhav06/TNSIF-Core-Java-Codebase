package com.day4.constructor;

import java.util.Scanner;

public class ConstructorDemo {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Customer Id: ");
		int id=sc.nextInt();
		System.out.println("Enter Customer Name: ");
		String name=sc.next();
		System.out.println("Enter Customer City: ");
		String city=sc.next();
		
		Customer c=new Customer();
		c.setCustomerId(id);;
		c.setCustomerCity(name);
		c.setCustomerName(city);
		System.out.println(c);
		
		Customer c1=new Customer(name, id, city);
		System.out.println(c1);
		
	}
	
	

}
