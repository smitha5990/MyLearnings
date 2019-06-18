package com.newpractice;

import java.util.Scanner;

public class Numberpyramidwithfn {
	
	
	public static void main(String []args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int n=s.nextInt();
		Numberpyramidwithfn p = new Numberpyramidwithfn();
		p.displayPyramid(n);
		s.close();
		
	}
	
	
	
	public void displayPyramid (int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println("");
		}
	}

}
