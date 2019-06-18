package com.practice;

import java.util.Scanner;

public class SwitchDayOfTheWeek {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int number=s.nextInt();
		dayoftheweek(number);
		daysoftheweek(number);
		s.close();
	}
	public static void dayoftheweek(int number) {
		int n=number;
		switch(n) {
		case 1:
			System.out.println("sunday");
			break;
		case 2:
			System.out.println("monday");
			break;
		case 3:
			System.out.println("tuesday");
			break;
		case 4:
			System.out.println("wednesday");
			break;
		case 5:
			System.out.println("thursday");
			break;
		case 6:
			System.out.println("friday");
			break;
		case 7:
			System.out.println("saturday");
			break;
		default:
			System.out.println("invalid input");
			break;
		}		
	}
	public static void daysoftheweek(int number) {
		if(number==1) {
			System.out.println("sunday");
		}
		else if(number==2) {
			System.out.println("monday");
		}
		else if(number==3) {
			System.out.println("tuesday");
		}
		else if(number==4) {
			System.out.println("wednesday");
		}
		else if(number==5) {
			System.out.println("thursday");
		}
		else if(number==6) {
			System.out.println("friday");
		}
		else if(number==7) {
			System.out.println("saturday");
		}
		else {
			System.out.println("invalid input");
		}
	}

}
