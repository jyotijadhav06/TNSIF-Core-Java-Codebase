package com.day7.interfacedemo;

public class BankDemo {

	public static void main(String[] args) {
		SavingAccount s1=new SavingAccount("joyti", "pune", 123456, 10000);
		
		s1.deposit(5000);
		System.out.println(s1);

		s1.withdraw(10001);
		System.out.println(s1);
	}
}
