package com.practice;

public class primenumber {
	public static void main(String [] args) {
		int n=10;
		for(int i=2;i<n;i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
				
		}
	}
	
	
	public static boolean isPrime(int n) {
		boolean isPrime = true;
		for(int i=2;i<=n/2;i++) {
			if(n%i ==0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
	
	

}
