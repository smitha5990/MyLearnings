package com.newpractice;

import java.util.Scanner;

public class MulMain {
	
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter two numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		MulService m=new MulService();
		int multi=m.mul(a,b);
		System.out.println(multi);
		s.close();
		
	}

}
