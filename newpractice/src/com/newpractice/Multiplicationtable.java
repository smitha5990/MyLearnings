package com.newpractice;

import java.util.Scanner;


public class Multiplicationtable {
	public static void main(String[]args) {
		Scanner mul =new Scanner(System.in);
		System.out.println("enter which number of multiplication table is needed");
		int a;
		int x;
		int n=mul.nextInt();
		for(int i=1;i<11;i++) {
			x=n*i;
			System.out.println(n+"*"+i+"="+x);
			
		}
		
	}

}
