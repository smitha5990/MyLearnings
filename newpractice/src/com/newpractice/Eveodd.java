//program to check weather the given number is even or odd

package com.newpractice;

import java.util.Scanner;

public class Eveodd {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		if(n%2==0) {
			System.out.println(n+" is an even number");
			}
		else
			System.out.println(n+" is an odd number");
		s.close();
	}

}
