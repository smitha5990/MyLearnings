package com.practice;

public class SimpleCalculator {
	private double firstnumber;
	private double secondnumber;
	
	public double getFirstnumber() {
		return firstnumber;
	}
	public void setFirstnumber(double firstnumber) {
		this.firstnumber = firstnumber;
	}
	public double getSecondnumber() {
		return secondnumber;
	}
	public void setSecondnumber(double secondnumber) {
		this.secondnumber = secondnumber;
	}
	
	public double getAdditionResult() {
		return this.firstnumber+this.secondnumber;
	}
	
	public double getSubtractionResult() {
		return this.firstnumber-this.secondnumber;
	}
	
	public double getMultiplicationResult() {
		return this.firstnumber*this.secondnumber;
	}
	public double getDivisionresult() {
		if(secondnumber==0) {
			return 0;
		}
		return this.firstnumber/this.secondnumber;
	}

	
}
