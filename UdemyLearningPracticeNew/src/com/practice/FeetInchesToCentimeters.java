package com.practice;

import java.util.Scanner;

public class FeetInchesToCentimeters {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter number of feet and inches");
		double feet=s.nextDouble();
		double inches=s.nextDouble();
		double centimeters=calcfeetinchestocentimeters(feet,inches);
		System.out.println(centimeters);
		System.out.println("enter the number of inches");
		double newinches=s.nextDouble();
		double cm=calcfeetinchestocentimeters(newinches);
		System.out.println(cm);
		s.close();
	}
	public static double calcfeetinchestocentimeters(double feet,double inches) {
			if((feet>=0)&&((inches>=0)&&(inches<=12))){
			double newinch=feet*12;
			double centimeters=(newinch+inches)*2.54;
			return centimeters;
		}
		else {
			return -1;
		}
	}
	public static double calcfeetinchestocentimeters(double inches) {
		if(inches>0) {
			double feet=(int)inches/12;
			inches =(int)inches%12;
			System.out.println("feet="+feet+" inches="+inches);
			return calcfeetinchestocentimeters(feet,inches); 
		}
		else {
			return -1;
		}
	}
	

}
