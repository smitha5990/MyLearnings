package com.practice;

import java.util.Scanner;

public class AreaCalculator {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value of the radius");
		double radius=s.nextDouble();
		double circle=area(radius);
		System.out.println(circle);
		System.out.println("enter the values of sides of a rectangle");
		double x=s.nextDouble();
		double y=s.nextDouble();
		double rectangle=area(x,y);
		System.out.println(rectangle);
		s.close();
	}
	public static double area(double radius) {
		double pi = Math.PI;
		if(radius>=0) {
			double area=radius*radius*pi;
			return area;
		}
		else {
			return -1;
		}		
	}
	
	public static double area(double x,double y) {
		if((x>=0)&&(y>=0)) {
			double area=x*y;
			return area;
		}
		else {
			return -1;
		}
	}
}
