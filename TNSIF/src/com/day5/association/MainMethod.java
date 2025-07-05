package com.day5.association;

public class MainMethod {
	
	public static void main(String[] args) {
		
		Address add=new Address("21 Shree nagar", "pune","Maharashtra");
		
		Person p1=new Person("Jyoti", add);
		p1.displayInfo();
		System.out.println(p1);
	}

}
