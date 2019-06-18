package com.newpractice;

import java.util.Scanner;

public class Numberpyramid {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.println("how many number of rows do you want to print?");
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println("\n");
		}
		s.close();
	}

}
