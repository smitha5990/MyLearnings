package com.practice.object;

import java.util.Scanner;

public class FDmain {
	public static void main (String []args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the amount to create FD");
		int amount=s.nextInt();
		FD fd = new FD(amount);
		System.out.println("FD created with amoun "+fd.getAmount());
		s.close();
		
		
	}

}
