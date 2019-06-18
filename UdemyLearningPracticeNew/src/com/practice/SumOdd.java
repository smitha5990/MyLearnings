package com.practice;

import java.util.Scanner;

public class SumOdd {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int n=s.nextInt();
		System.out.println("enter the range");
		int start=s.nextInt();
		int end=s.nextInt();
		int sumodds=sumodd(start,end);
		s.close();
	}
	public static boolean odd(int n) {
		if(n%2!=0) {
			return true;
		}
		else {
			return false;
		}
	}
	public static int sumodd(int start,int end) {
		int sum=0;
		if((start>0)&&(end>0)) {
			for(int i=start;i<=end;i++) {
				boolean g=odd(i);
				if(g==true) {
					sum=sum+i;
				}
			}
			System.out.println(sum);
			return sum;
		}
		else {
			return -1;
		}
	}

}
