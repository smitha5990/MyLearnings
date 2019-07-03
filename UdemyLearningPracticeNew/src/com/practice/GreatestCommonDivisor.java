package com.practice;

import java.util.Scanner;

public class GreatestCommonDivisor {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter two numbers");
		int first=s.nextInt();
		int second=s.nextInt();
		gcd(first,second);
		//System.out.println(gcds);
		s.close();
	}
	public static void gcd(int n,int m) {
		int i=1;
		int j=1;
		for(i=1,j=1;i<=n && j<=m;i++,j++) {
			if((n%i==0)&&(m%j==0)) {
				
			}
		}
	}

}
