package com.practice;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int n=s.nextInt();
		boolean g=palindromenumber(n);
		System.out.println(g);
		s.close();
	}
	public static boolean palindromenumber(int n) {
		int number=n;
		int rev=0;
		while(n!=0) {
			int r=n%10;
			n=n/10;
			rev=(rev*10)+r;
		}
		System.out.println("reversed number is "+rev);
		if(rev==number) {
			System.out.println(number+" is a palindrome");
		       return true;
		       
		}
		else {
			System.out.println(number+" is not a palindrome");

			return false;
		}
		
	}

}
