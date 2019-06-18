package com.practice;

import java.util.Scanner;

public class CatPlaying {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.println("tell weather it is summer or not");
		boolean summer=s.nextBoolean();
		System.out.println("enter the temperature");
		int temperature=s.nextInt();
		boolean cat=iscatplaying(summer,temperature);
		System.out.println(cat);
		s.close();
	}
	public static boolean iscatplaying(boolean summer,int temperature) {
		if(summer=false) {
			if((temperature>=25)&&(temperature<=35)) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			if((temperature>=25)&&(temperature<=45)) {
				return true;
			}
			else {
				return false;
			}
		}
	}
}
			
