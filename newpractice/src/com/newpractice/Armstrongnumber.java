package com.newpractice;

import java.util.Scanner;

public class Armstrongnumber {
	
	public static void main(String[]args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter a number");
		int n=s.nextInt();
		int m=n;
		int a;
		int b=0;
		while(n!=0) {
			int r=n%10;
			int q=n/10;
			n=q;
			a=r*r*r;
			b=a+b;
		}
		if(b==m) {
			System.out.println(m+" is an armstrong number");
		}
		else {
			System.out.println(m+" is not an armstrong number");
		}
		System.out.println(b);
		s.close();
	}


}
