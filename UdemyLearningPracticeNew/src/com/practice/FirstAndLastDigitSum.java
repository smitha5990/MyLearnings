package com.practice;

import java.util.Scanner;

public class FirstAndLastDigitSum {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int n=s.nextInt();
		int num=firstandlastdigitsum(n);
		System.out.println(num);
		
		
		s.close();		
	}
	public static int firstandlastdigitsum(int n) {
		int number=n;
		int rev=0;
		if(n>0) {
			while(n!=0) {
				int r=n%10;
				n=n/10;
				rev=(rev*10)+r; 
			}
			System.out.println(number+" is the number and "+rev+" is reversed of it");
			int a=number%10;
			int b=rev%10;
			int sum=a+b;
			return sum;
		}
		else {
			return -1;
		}
	}

}
