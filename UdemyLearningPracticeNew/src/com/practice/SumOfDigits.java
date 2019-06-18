package com.practice;
import java.util.Scanner;

public class SumOfDigits {
	
	public static void main (String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		//int n=432;
		int t=digit(n);
		System.out.println("sum is "+t);
		s.close();
		}
	public static int digit (int n) {
		int m=0;
		while(n!=0) {
			int r=n%10;
			n=n/10;
			m=m+r;
			//return m;
		}
		return m;
	}

}
