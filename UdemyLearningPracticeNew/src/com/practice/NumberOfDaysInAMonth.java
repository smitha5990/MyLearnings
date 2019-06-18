package com.practice;

import java.util.Scanner;

public class NumberOfDaysInAMonth {
	public static void main(String []args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the year");
		int year=s.nextInt();
		boolean g=isleapyear(year);
		System.out.println(g);
		System.out.println("enter the month");
		int month=s.nextInt();
		int m=numberofdays(year,month);
		System.out.println(m);
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
	
	public static int numberofdays(int year,int month) {
		int m = 0;
		if(((month>=1)&&(month<=12))&&((year>1)&&(year<9999))) {
			switch (month) {
			case 1: case 3: case 5: case 7: case 9: case 11:
				m= 31;
				break;
			case 4: case 6: case 8: case 10: case 12:
				m=30;
				break;
			case 2:
				boolean g=isleapyear(year);
				if(g=true) {
					m=29;
					break;
				}
				else {
					m=28;
					break;
				}
				
			}
			return m;
		}
		else {
			return -1;
		}
	}
	

}
