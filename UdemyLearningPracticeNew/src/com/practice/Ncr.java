package com.practice;
import java.util.Scanner;

public class Ncr {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter n and r");
		int n=s.nextInt();
		int r=s.nextInt();
		int m=n-r;
		int fn=fact(n);
		int fr=fact(r);
		int fm=fact(m);
		int ncr=fn/(fr*fm);
		System.out.println(ncr);
		s.close();
		
	}
	public static int fact(int n) {
		int a=1;
		while(n!=0) {
			a=a*n;
			n--;
		}
		return a;
	}

}
