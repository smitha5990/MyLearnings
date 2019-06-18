package com.practice;

public class sumofanumber {
	public static void main(String []args) {
		int n=1234;
		int s=0;
		int r;
		while(n!=0) {
			r=n%10;
			n=n/10;
			s=s+r;
		}
		System.out.println("the sum is "+s);
	}

}
