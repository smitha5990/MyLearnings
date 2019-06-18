package com.practice;

import java.util.Scanner;

public class UserInput {
	
	
	
	public static void main(String[] args) {
		
	    Scanner scanner = new Scanner(System.in);
	     
	    System.out.println("Your name: ");
	    String name = scanner.nextLine(); // we know it's a `string`
	    
	    System.out.println("Location: ");
	    String location = scanner.nextLine(); // a string again
	     
	    System.out.println("Your age: "); 
	    int age = scanner.nextInt(); // it's an integer
	     
	  
	    
	    System.out.println("Name :"+ name +" Age "+age+" Location: "+location);
	}

}
