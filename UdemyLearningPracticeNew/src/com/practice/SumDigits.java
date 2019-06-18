package com.practice;

import java.util.Scanner;

public class SumDigits {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		int sum=sumdigits(n);
		System.out.println("sum of the digits of "+n+" is "+sum);
		s.close();
	}
	public static int sumdigits(int n) {
		int sum=0;
		if(n>9) {
			while(n!=0) {
			    int r=n%10;
				n=n/10;
				sum=sum+r;
			}
			return sum;
		}
		else {
			return -1;
		}
	}

}
