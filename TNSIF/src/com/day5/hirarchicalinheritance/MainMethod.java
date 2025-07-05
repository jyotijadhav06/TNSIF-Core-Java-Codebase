package com.day5.hirarchicalinheritance;

public class MainMethod {
	
	public static void main(String[] args) {
		
		Person p1=new Person();
		System.out.println(p1);
		
		Person p;
		p=new Person("pune","jyoti");
		System.out.println("Person detail: "+p);
		
		p=new Student("TE",86.66f, "pune", "jyoti");
		System.out.println("Student detail: "+p);
		
		p=new Employee(101, "computer", "20000", "pune","jyoti");
		System.out.println("Employee detail: "+p);
		
	}

}
