package com.practice;

import java.util.Scanner;

public class NumberToWords {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int number=s.nextInt();
		numbertoword(number);
		int g=getdigitcount(number);
		System.out.println(g);
		s.close();
	}
	public static void numbertoword(int n) {
		int rev=reverse(n);
		int r;
		while(rev!=0) {
			r=rev%10;
			rev=rev/10;
			int num=r;
			switch(num) {
			case 0:
				System.out.print(" zero");
				break;
			case 1:
				System.out.print(" one");
				break;
			case 2:
				System.out.print(" two");
				break;
			case 3:
				System.out.print(" three");
				break;
			case 4:
				System.out.print(" four");
				break;
			case 5:
				System.out.print(" five");
				break;
			case 6:
				System.out.print(" six");
				break;
			case 7:
				System.out.print(" seven");
				break;
			case 8:
				System.out.print(" eight");
				break;
			case 9:
				System.out.print(" nine");
				break;
			}
		}
	}
	public static int reverse(int n) {
		int rev=0,r;
		while(n!=0) {
			r=n%10;
			n=n/10;
			rev=(rev*10)+r;
		}
		return rev;
	}
	public static int getdigitcount(int n) {
		int count=0,r;
		while(n!=0) {
			r=n%10;
			int s=r/r;
			count=count+s;
			n=n/10;
		}
		return count;
	}

}
