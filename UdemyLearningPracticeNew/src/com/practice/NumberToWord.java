package com.practice;

import java.util.Scanner;

public class NumberToWord {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int n=s.nextInt();
		numbertoword(n);
		s.close();
	}
	public static void numbertoword(int n) {
		int m=n;
		switch(m) {
		case -3:
			System.out.println("negative three");
			break;
		case -2:
			System.out.println("negative two");
			break;
		case -1:
			System.out.println("negative one");
			break;
		case 0:
			System.out.println("zero");
			break;
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		default:
			System.out.println("invalid");
		}
	}

}
