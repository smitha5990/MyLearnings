package com.practice;
import java.util.Scanner;

public class BarkingDog {
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		boolean isbarking=true;
		System.out.println("enter the time");
		int time=s.nextInt();
		boolean g=wakeup(isbarking,time);
		System.out.println(g);
		s.close();
	}
	
	public static boolean wakeup(boolean isbarking,int time) {
		if((time<8 && time>0)||(time>22 && time<24)) {
			return true;
		}
		else {
			return false;
		}
	}
}