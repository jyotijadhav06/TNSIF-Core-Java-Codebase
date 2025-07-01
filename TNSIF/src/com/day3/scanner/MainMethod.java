package com.day3.scanner;

import java.util.Scanner;

public class MainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name:");
		String name=sc.next();
		System.out.println("Enter age:");
		int age=sc.nextInt();
		System.out.println("Enter Gender");
		String gender=sc.next();
		System.out.println("Enter Income");
		int income=sc.nextInt();
		System.out.println("Enter MobileNo:");
		long mobileno=sc.nextLong();
		
		Person person=new Person();
		person.setAge(age);
		person.setName(name);
		person.setGender(gender);
		person.setIncome(income);
		person.setMobileNumber(mobileno);
		
		//to print using getter
		//System.out.println(per.getAge());
		
		TaxCalculation tc=new TaxCalculation();
		tc.calculateTax(person);
		
		//to print using tostring
		System.out.println(person);
	}

}
