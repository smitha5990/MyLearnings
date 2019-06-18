package com.practice;
import java.util.Scanner;

public class LeapYearTest {
	
	
	public static void main(String []args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the year");
		int year=s.nextInt();
		boolean g=isleapyear(year);
		System.out.println(g);
		s.close();
	}
	
	public static boolean isleapyear(int year) {
		if(year>=1 && year<=9999) {
			if((year%4==0) || (year%100==0) || (year%400==0)) {
					return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}

}
