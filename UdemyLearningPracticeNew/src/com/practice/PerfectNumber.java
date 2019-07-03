package com.practice;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[]args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter a number");
		int n=s.nextInt();
		boolean g=number(n);
		System.out.println(g);
		s.close();
	}
	public static boolean number(int n) {
		int i=1,f=1,sum=0;
		if(n>=1) {
			for(i=1;i<n;i++) {
				if(n%i==0) {
					f=i;
					sum=sum+f;
				}
			}
			if(sum==n)
				return true;
			else
				return false;
			}
		else {
			return false;
		}
	}

}
