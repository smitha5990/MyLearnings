package com.practice;
import java.util.Scanner;

public class PositiveNegativeZero {
	public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number");
	int n=s.nextInt();
	check(n);
	
	s.close();
	}
	
	public static void check(int n) {
		if(n>0) {
			System.out.println("positive");
		}
		else if(n<0) {
			System.out.println("negative");
		}
		else {
			System.out.println("zero");
		}
	}

}
