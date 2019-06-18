package com.practice;

import java.util.Scanner;

public class TeenNumberChecker {
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter three numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		boolean g=hasteen(a,b,c);
		System.out.println(g);
		System.out.println("enter a number");
		int d=s.nextInt();
		boolean h=isteen(d);
		System.out.println(h);
		s.close();
	}
	
	public static boolean hasteen(int a,int b,int c) {
		if((a>=13)&&(a<=19)|| (b>=13)&&(b<=19) || (c>=13)&&(c<=19)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean isteen(int d) {
		if((d>=13) && (d<=19)) {
			return true;
		}
		else {
			return false;
		}
	}
}
