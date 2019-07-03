package Udemy;

import java.util.Scanner;

public class CarClassMain {
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter car details");
		
		CarClass car = new CarClass();
		
		System.out.println("Enter car company");
		
		String carCompany = null;
		
		carCompany = sc.nextLine();
		
		car.setCompany(carCompany);
		
		System.out.println("car campany is "+car.getCompany());
		
		
		
		
		
		
	}

}
