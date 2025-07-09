package com.day11.trycatch;

public class TryCatchdemo {
	
	static void performDivision(int x,int y){
		System.out.println("I am in try block");
		int z;
		try {
			z=x/y;
			System.out.println("Result of z: "+z);
		}
		catch(ArithmeticException e){
			System.err.println("Divide by zero exception occured");
		}
	}
	

}
