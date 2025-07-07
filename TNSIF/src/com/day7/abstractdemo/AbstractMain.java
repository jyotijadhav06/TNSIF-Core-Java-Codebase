package com.day7.abstractdemo;

public class AbstractMain {
	public static void main(String[] args) {
		
		Shape s;
		s=new Rectangular(10.0f, 20.0f);
		s.calarea();
		s.show();;
	}

}
