package com.newpractice;

import java.util.Scanner;

public class FtoCMain {
	
	public static void main(String[]args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("press 1 to enter temperature in faranheit");
		System.out.println("press 2 to enter temperature in celcius");
		int n=s.nextInt();
		if (n==1) {
			System.out.println("enter the temperature in faranheit");
			double f=s.nextDouble();
			FtoC fc=new FtoC();
			double c=fc.convertftoc(f);
			System.out.println(c);
		}
		else if(n==2) {
			System.out.println("enter the temperature in celcius");
			double c=s.nextDouble();
			FtoC cf=new FtoC();
			double f=cf.convertctof(c);
			System.out.println(f);
			
			
		}
	}

}
