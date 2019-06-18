package com.newpractice;

import java.util.Scanner;

public class Fibonacciseries {
	
	public static void main(String[]args) {
		
		Scanner f=new Scanner(System.in);
		
		System.out.println("how many numbers do you want in the series?");
		
		int n=f.nextInt();
		int i=0;
		int j=1;
		int sum;
		System.out.print(i+","+j);
		for(int k=1;k<=n;k++) {
			sum=i+j;
			i=j;
			j=sum;
			System.out.print(","+sum);
		}
		f.close();
		}

}
