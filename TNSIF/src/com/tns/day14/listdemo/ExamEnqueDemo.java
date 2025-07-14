package com.tns.day14.listdemo;

import java.util.ArrayDeque;
import java.util.Deque;

public class ExamEnqueDemo {
	
	public static void main(String[] args) {
		Deque<String> de=new ArrayDeque<String>();
		de.add("null");
		de.add("jyoti");
		de.add("dik");
		de.add("jyoti");
		
		System.out.println(de);
	
		de.pollFirst();
		System.out.println(de);
		
		de.pollLast();
		System.out.println(de);
		
		for(String str:de) {
			System.out.print(str+" ");
		}
	}

}
