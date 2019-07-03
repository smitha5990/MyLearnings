package com.practice;

import java.util.Scanner;

public class SimpleCalculatorMain {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter two numbers");
		double firstnumber=s.nextDouble();
		double secondnumber=s.nextDouble();
		SimpleCalculator sc=new SimpleCalculator();
		sc.setFirstnumber(firstnumber);
		sc.setSecondnumber(secondnumber);
		System.out.println("addition result is "+sc.getAdditionResult());
		System.out.println("subtraction result is "+sc.getSubtractionResult());
		System.out.println("multiplication result is "+sc.getMultiplicationResult());
		
		s.close();
	}

}
