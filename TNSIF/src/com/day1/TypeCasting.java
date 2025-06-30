package com.day1;

public class TypeCasting {
	public static void main(String[] args) {
		 //widening
		byte b=10;
		int i=b;
		System.out.println(i);
		
		float f=12.23f;
		double d=f;
		System.out.println(d);
		
		//narrowing
		double d1=234.56d;
		long l=(long)d1;
		System.out.println(l);
		
		short b2=130;
		byte s=(byte)b;
		System.out.println(s);
	}
}
