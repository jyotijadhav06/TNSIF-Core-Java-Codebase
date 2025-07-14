package com.tns.day14.listdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		List list=new ArrayList();
		
		System.out.println(list.isEmpty());
		
		list.add(10);
		list.add(20);
		list.add("Jyoti");
		list.add(true);
		list.add(12.1f);
		
		System.out.println(list);
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		System.out.println(list.contains(1));
		System.out.println(list.indexOf(20));
		
		System.out.println("..........");
		//generics
		List<String> names=new ArrayList<String>();
		names.add("jyoti");
		//names.add(10);
		names.add(null);
		names.add("Jyoti");
		names.add("dik");
		System.out.println(names);
		
		Collections.reverse(names);
		System.out.println(names);
		
		System.out.println(names.contains("jyoti"));
		
		//Collections.sort(names);
		//System.out.println(names);
		
		//traversing in list
		Iterator<String> i=names.iterator();
		while(i.hasNext()) {
			String nm=i.next();
			System.out.print(nm+" ");
		}
		System.out.println();
		
		ListIterator<String> li=names.listIterator(names.size());
		while(li.hasPrevious()) {
			String nm=li.previous();
			System.out.print(nm+" ");
		}
	}

}
