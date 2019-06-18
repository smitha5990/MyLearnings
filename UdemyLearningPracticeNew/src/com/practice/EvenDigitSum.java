package com.practice;

import java.util.Scanner;

public class EvenDigitSum {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int n=s.nextInt();
		int sum=getevendigitsum(n);
		System.out.println(sum);
		s.close();
	}
	public static int getevendigitsum(int n) {
		int sum=0;
		if(n>0) {
			while(n!=0) {
				int r=n%10;
				n=n/10;
				if(r%2==0) {
					sum=sum+r;
				}
			}
			return sum;
		}
		else {
			return -1;
		}
	}

}
