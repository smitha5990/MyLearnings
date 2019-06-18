package com.practice;

import java.util.Scanner;

public class stringreverse {
	public static void main(String []args) {
		String r ="";
		Scanner ab= new Scanner(System.in);
		System.out.println("enter a string");
		String s=ab.nextLine();
		
		for(int i=s.length()-1;i>=0;i--) {
			r = r+s.charAt(i);			
		}
		System.out.println(r);
		
	}

}
