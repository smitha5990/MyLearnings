package com.newpractice;

import java.util.Scanner;

public class FullPyramid {
	
	public static void  main(String []args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<n;j++) {
				for(int k=n;k>=1;k-- ) {
					System.out.print(j&k);	
					System.out.println("");
					
				}
				
			}
		}
		s.close();
	}

}
