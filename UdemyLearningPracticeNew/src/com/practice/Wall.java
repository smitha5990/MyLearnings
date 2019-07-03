package com.practice;

public class Wall {
	private double height;
	private double width;
	
	public Wall() {
		
	}
	public Wall(double height,double width) {
		if(height<=0) {
			this.height=0;
		}
		else {
			this.height=height;
		}
		if(width<=0) {
			this.width=0;
		}
		else {
			this.width=width;
		}
	}
	
	public double getHeight() {
		return height;
	}
	public double getWidth() {
		return width;
	}
	
	public double area(double height,double width) {
		double area=height*width;
		System.out.println("area="+area);
		return area;		
	}
}











