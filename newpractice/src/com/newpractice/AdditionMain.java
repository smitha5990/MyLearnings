package com.newpractice;

import java.util.Scanner;

public class AdditionMain {
	
	public static void main(String[]args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter 2 numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		AdditionService ad=new AdditionService();
		int sum=ad.add(a,b);
		System.out.println("sum of "+a+" and "+b+"is"+sum);
		s.close();
		
		
		
	}

}
