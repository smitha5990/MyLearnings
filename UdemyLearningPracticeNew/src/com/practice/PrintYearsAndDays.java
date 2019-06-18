package com.practice;

import java.util.Scanner;

public class PrintYearsAndDays {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number of minutes");
		long minutes=s.nextLong();
		yearsanddays(minutes);
		s.close();
	}
	public static void yearsanddays(long minutes) {
		if(minutes>=0) {
			long years=minutes/525600;
			long remainingminutes=minutes%525600;
			long days=remainingminutes/1440;
			System.out.println(minutes+" minutes ="+years+" years and "+days+" days ");
		}
		else {
			System.out.println("invalid input");
		}
	}

}
