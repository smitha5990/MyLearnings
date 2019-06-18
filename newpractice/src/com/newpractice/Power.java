//program to calculate the power of a number

package com.newpractice;

import java.util.Scanner;

public class Power {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number first and then the power");
		int m=s.nextInt();
		int n=s.nextInt();
		int p=1;
		while(n!=0) {
			p=p*m;
			n--;
		}
		System.out.println(p+" is the answer");
		s.close();
	}

}
