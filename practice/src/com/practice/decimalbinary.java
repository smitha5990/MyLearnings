package com.practice;

public class decimalbinary {

	public static void main(String[]args) {
		int []a=new int[5];
		int n=9;
		int r;
		int i=0;
		
		while(n!=0) {
			r=n%2;
			n=n/2;
			a[i]=r;
			i++;
		}
		for(int k=0;k<a.length;k++) {
		//System.out.print(a[k]);
		}
		for(int j=a.length-1;j>=0;j--) {
			System.out.print(a[j]);
		}
		
		
	}
}
