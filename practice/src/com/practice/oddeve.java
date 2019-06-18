package com.practice;

import java.util.Scanner;

public class oddeve {
	
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		System.out.println("How many numbers do you want to enter :");
		int n = s.nextInt();
		int [] a = new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter your numer ");
			a[i] = s.nextInt();
		}
		
		System.out.println("Array numbers are");
		for(int i =0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		
	}

}
