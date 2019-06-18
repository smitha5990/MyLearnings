package com.newpractice;

import java.util.Scanner;

public class ArrayReadDisplay {
	
	
	public int[]  readInput() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter how many numbers  you want to enter");
		int n=s.nextInt();
		int[]a=new int[n];
		System.out.println("enter the numbers");
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		s.close();
		return a;
		
		
		// stores value in array and will return the same
	}
	

	public void display(int [] a) {
		System.out.println("entered numbers are");
		for(int j=0;j<a.length;j++) {
			System.out.println(a[j]);
		}
		
	}
	
}
