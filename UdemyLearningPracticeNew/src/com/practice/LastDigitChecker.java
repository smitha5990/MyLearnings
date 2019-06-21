package com.practice;

import java.util.Scanner;

public class LastDigitChecker {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter 3 numbers");
		int num1=s.nextInt();
		int num2=s.nextInt();
		int num3=s.nextInt();
		boolean check=checker(num1,num2,num3);
		System.out.println(check);
		s.close();
	}
	public static boolean checker(int n1,int n2,int n3) {
		if(((n1>=10)&&(n1<=1000))&& ((n2>=10)&&(n2<=1000)) && ((n3>=10)&&(n3<=1000))) {
			int n=n1%10;
			int m=n2%10;
			int p=n3%10;
			if((n==m)||(m==p)||(p==n)){
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
