//program to find largest of 3 numbers

package com.newpractice;

import java.util.Scanner;

public class Largestofthree {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter 3 numbers");
		int n=s.nextInt();
		int m=s.nextInt();
		int p=s.nextInt();
		int l;
		if(n>m && n>p) {
			System.out.println(n+" is the largest among the 3 numbers");	
		}
		else if(m>n && m>p) {
			System.out.println(m+" is the largest among the 3 numbers");
		}
		else
			System.out.println(p+" is the largest among the 3 numbers");
		s.close();
	}

}
