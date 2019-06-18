package com.newpractice;

import java.util.Scanner;

public class Addnnum {
	
	public static void main(String[]args) {
		
		Scanner ab=new Scanner (System.in);
		System.out.println("how many numbers do you want to add?");
		int n=ab.nextInt();
		int s=0;
		System.out.println("enter "+n+" numbers");
		for(int i=0;i<n;i++) {
			s=s+ab.nextInt();
		}
		System.out.println("sum of "+n +" is " +s );
		ab.close();
		
		
	}

}
