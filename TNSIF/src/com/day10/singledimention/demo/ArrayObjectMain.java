package com.day10.singledimention.demo;

public class ArrayObjectMain {
	public static void main(String[] args) {
		Student s[]=new Student[5];
		
		s[0]=new Student(01, "jyoti");
		s[1]=new Student(02, "abc");
		s[2]=new Student(03, "abc");
		s[3]=new Student(04, "abc");
		s[4]=new Student(05, "abc");
		
		for(int i=0;i<s.length;i++) {
			System.out.println("Elements at"+i+":"+s[i].getRollno()+"\t"+s[i].getName());
		}
		
	}

}
