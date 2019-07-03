package com.practice;

import java.util.Scanner;

public class AllFactors {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int number=s.nextInt();
		factors(number);
		//System.out.println(f);
		s.close();
	}
	public static void factors(int number) {
		int i=1;
		int fact=1;
		if(number>1) {
			for(i=1;i<=number;i++) {
				if(number%i==0) {
					fact=i;
					System.out.println(fact);
				}
			}
		}
		else {
			System.out.println("invalid number");
		}
	}

}
