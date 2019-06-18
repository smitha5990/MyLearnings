package Udemy;

import java.util.Scanner;

public class ForLoop {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the amount");
		double amount=s.nextDouble();
		for(double interestrate=2;interestrate<=8;interestrate++) {
		double calint=calculateinterest(amount,interestrate);
		System.out.println(calint);
		}
		
		for(double interestrate=8;interestrate>=2;interestrate--) {
			double calint=calculateinterest(amount,interestrate);
			System.out.println(calint);
			}
		s.close();
		
	}
	public static double calculateinterest(double amount,double interestrate) {
		return(amount*(interestrate/100));
	}

}
