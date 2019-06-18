package com.newpractice;

public class AnimalMain {
	
	public static void main(String []args) {
		
		AnimalService al=new AnimalService();
		Animal[]b=al.readdomesticanimal();
		al.Displayanimal(b);
		
		

		
	}

}
