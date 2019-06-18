package com.practice;

import java.util.Scanner;

public class PrintEqual {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter 3 numbers");
		int x=s.nextInt();
		int y=s.nextInt();
		int z=s.nextInt();
		Printequal(x,y,z);
		s.close();
	}
	public static void Printequal(int x,int y,int z) {
		if((x>0)&&(y>0)&&(z>0)) {
			if((x==y)&&(y==z)) {
				System.out.println("all the numbers are equal");
			}
			else {
				System.out.println("all the numbers are not equal");
			}
		}
		else {
			System.out.println("invalid input");
		}
	}

}
