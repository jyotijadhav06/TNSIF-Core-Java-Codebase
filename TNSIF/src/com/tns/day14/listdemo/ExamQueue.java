package com.tns.day14.listdemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExamQueue {
	
	public static void main(String[] args) {
		Queue<Integer> r=new LinkedList<Integer>();
		r.add(10);
		r.add(20);
		r.add(30);
		System.out.println(r);
		
		int positionPeek=r.peek();
		System.out.println(positionPeek);
		
		int position=r.element();
		System.out.println(position);
		
		Iterator q=r.iterator();
		while(q.hasNext()) {
			//int n=q.next();
			//System.out.println(n);
		}
		
		System.out.println(r.poll());
		
	}

}
