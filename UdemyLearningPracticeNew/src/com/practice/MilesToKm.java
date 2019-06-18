package com.practice;
import java.util.Scanner;

public class MilesToKm {
	
	public static void main(String []args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the value");
		double kmph=s.nextDouble();
		long g=tomilesperhour(kmph);
		printconversion(kmph);
		System.out.println(g);
		s.close();
	}
	
	public static long tomilesperhour(double kmph) {
		if(kmph<0) {
			return -1;			
		}
		else {
			double a=1.609*kmph;
			long r=Math.round(a);
			return r;
		}
	}
	
	public static void printconversion(double kmph) {
		long m=tomilesperhour(kmph);
		if(kmph<0) {
			System.out.println("invalid input");
		}
		else {
			System.out.println(kmph+"kmph = " +m+ "miph");
		}
	}

}
