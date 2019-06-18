package com.practice;

import java.util.Scanner;

public class SecondsAndMinutes {
	public static void main(String[]args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter minutes ans seconds");
		int minutes=s.nextInt();
		int seconds=s.nextInt();
		secondsminutes(minutes,seconds);
		System.out.println("enter seconds");
		int newseconds=s.nextInt();
		secondsminutes(newseconds);
		s.close();
	}
	public static void secondsminutes(int minutes,int seconds) {
		if((minutes>=0)&&((seconds>=0)&&(seconds<=59))) {
			int newsec=(minutes*60)+seconds;
			int hour=newsec/3600;
			int newmin=newsec%3600;
			minutes=newmin/60;
			int newseconds=newmin%60;
			System.out.println( hour+" hh "+minutes+" min "+newseconds+" sec ");
		}
		else {
			System.out.println("invalid input");
		}
	}
	
	public static void secondsminutes(int seconds) {
		if(seconds>=0) {
			int minutes=seconds/60;
			seconds=seconds%60;
			secondsminutes(minutes,seconds);
		}
		else {
			System.out.println ("invalid input");
		}
	}

}
