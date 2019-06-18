package com.practice;

public class SumOf3sAnd5s {
	public static void main(String[]args) {
		int count=0;
		int sum=0;
		for (int i=1;i<=1000;i++) {
			if((i%3==0)&&(i%5==0)) {
				count=count+1;
				System.out.println(i);
				sum=sum+i;
				if(count==5) {
					System.out.println("exiting");
					break;
				}
				
			}
			
		}
		System.out.println("sum = "+sum);
	}

}
