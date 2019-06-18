package com.practice;
import java.util.Scanner;

public class KiloBytesToMegaBytes {
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number of bytes");
		int kb=s.nextInt();
		printmbandkb(kb);
		
		s.close();
	}
	
	public static void printmbandkb(int kb) {
		if(kb<0) {
			System.out.println("invalid input");
		}
		else {
			int mb=kb/1024;
			int rkb=kb%1024;
			System.out.println(kb+" kilobytes = "+mb+" megabytes + "+rkb+" remaining kilobytes");
		}
	}

}
