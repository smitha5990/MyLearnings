package com.practice;

import java.util.Scanner;

public class EqualSumChecker {
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter three numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		boolean g=hasequealsum(a,b,c);
		System.out.println(g);
		s.close();
	}
	
	public static boolean hasequealsum(int a,int b,int c) {
		int d=a+b;
		if(d==c) {
			return true;
		}
		else {
			return false;
		}
		
	}
}
