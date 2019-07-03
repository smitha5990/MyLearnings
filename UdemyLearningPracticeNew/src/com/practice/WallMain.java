package com.practice;

import java.util.Scanner;

public class WallMain {
	
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the values of height and width");
		double height=s.nextDouble();
		double width=s.nextDouble();
		Wall number1=new Wall(height,width);
		double arearesult=number1.area(height, width);
		s.close();
	}

}
