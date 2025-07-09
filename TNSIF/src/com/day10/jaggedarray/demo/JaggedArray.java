package com.day10.jaggedarray.demo;


class Jarray{
	 static void printArray(int c[][]) {
		 System.out.println("Array of elements are as follows");
		 for(int i=0;i<c.length;i++) {
			 
			 for(int j=0;j<c[i].length;j++) {
				 System.out.print(c[i][j]+" ");
			 }
			 System.out.println();
		 }
	 }
}

public class JaggedArray {

		public static void main(String[] args) {
			
			int c[][]= {{10,20},{20,30,40},{50},{1,2,3,4,5}};
			System.out.println(c.length);
			Jarray.printArray(c);
		}
	}


