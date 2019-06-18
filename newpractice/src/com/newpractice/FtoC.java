package com.newpractice;

public class FtoC {
	public double convertftoc(double f) {
		double c=(f-32)/1.8;
		return c;
		
	}
	
	public double convertctof(double c) {
		double f=(c*1.8)+32;
		return f;
	}
	

}
