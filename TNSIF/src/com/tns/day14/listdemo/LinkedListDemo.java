package com.tns.day14.listdemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		LinkedList<Integer> li=new LinkedList<Integer>();
		
		li.add(10);
		li.addFirst(20);
		li.add(30);
		li.addLast(50);
		li.add(60);
		
		System.out.println(li);
		
		li.addLast(80);
		System.out.println(li);
		
		li.removeFirst();
		li.removeLast();
		System.out.println(li);
		
		ListIterator<Integer> l=li.listIterator();
		while(l.hasNext()) {
			int n=l.next();
			System.out.print(n+" ");
		}
		System.out.println();
		
		l=li.listIterator(li.size());
		while(l.hasPrevious()) {
			int n=l.previous();
			System.out.print(n+" ");
		}
		System.out.println();
		
	}

}
