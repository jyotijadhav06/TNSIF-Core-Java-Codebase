package com.day6.finaldemo;

final class finaldemo1{
	void show() {
		System.out.println("final class cannot be inherited");
	}
}
public class FinalDemo {
	
	public static void main(String[] args) {
		finaldemo1 f=new finaldemo1();
		f.show();
	}
	

}
