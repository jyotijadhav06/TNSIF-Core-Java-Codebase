package com.day10.singledimention.demo;

 class Arrayoperation1 {
	
	static void printArray(int arr[]) { 
		
		for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+"\t");
		System.out.println();
		
		}
	}	
		public static int getSum(int... n) {
			int sum=0;
			for(int no:n)
				sum+=no;
			return sum;
		}
		public static int getoddCount(int b[]) {
			int count=0;
			for(int i=0;i<b.length;i++) {
				if(b[i]%2!=0)
					count++;
			}
			return count;
		}
		public static int getEvenCount(int b[]) {
			return b.length-getoddCount(b);
		}
public class ArrayOperationOne{
	
	public static void main(String[] args) {
		int n=10;
		int a[];
		a=new int[n];
		
		Arrayoperation1.printArray(a);
		
		for(int i=0;i<a.length;i++) {
			a[i]=5*i;
			Arrayoperation1.printArray(a);
		}
		
		int b[]= {10,20,30,40};
		Arrayoperation1.printArray(b);
		System.out.println("Sum of the array element is: "+Arrayoperation1.getSum(b));
		System.out.println("Sum of the array element is: "+Arrayoperation1.getSum(10,20,30,40,80));
		
		b[2]=999;
		Arrayoperation1.printArray(b);
		System.out.println("odd number: "+Arrayoperation1.getoddCount(b)+"\t Even no"+Arrayoperation1.getEvenCount(b));
		System.out.println();
	}
	
}
	
}

