package com.day1;

public class IncreDecre {

	public static void main(String[] args) {
		
		int a=10,b=20,c=0;
		++a;
		int c1=++a+b+a--;
		System.out.println("c1 value after increment: "+c1);
		
		int c2=c1++ +b+a--;
		System.out.println("c2 value after increment: "+c2);
	}

}
