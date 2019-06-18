//program to find GCD of 2 numbers

package com.newpractice;

import java.util.Scanner;

public class GCD {
	
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter two numbers");
		int n=s.nextInt();
		int m=s.nextInt();
		int gcd=0;
		if(m>n) {
			int r=1;
			while(r!=0) {
			r=m%n;
			m=n;
			n=r;
			}
		if(m==0) {
			gcd=n;
		}
		else {
			gcd=m;
		}
			System.out.println(gcd);
		}
		else {
			int r=1;
			while(r!=0) {
				r=n%m;
				n=m;
				m=r;
			}
			if(m==0) {
				gcd=n;
			}
			else {
				gcd=m;
			}
			System.out.println(gcd);
			}
		
		s.close();
		}
	
	}
