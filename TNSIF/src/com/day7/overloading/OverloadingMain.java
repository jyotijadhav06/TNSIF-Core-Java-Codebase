package com.day7.overloading;

public class OverloadingMain {
		
	public static void main(String[] args) {
		Point p=new Point();
		System.out.println(p);
		
		Point p1=new Point(0.1f);
		System.out.println(p1);
		
		Point p2=new Point(0.1f, 9.9f);
		System.out.println(p2);
		
	}
}
