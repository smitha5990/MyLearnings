package com.newpractice;

import java.util.Scanner;

public class Employeemain {
	public static void main (String[]args) {
		
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number of employees");
		int n=s.nextInt();
		
		Employee []  employees = new Employee[n];
		for(int i =0;i<n;i++) {
			
			s.nextLine();
			
			System.out.println("Enter name");
			String name = s.nextLine();
			
			System.out.println("Enter age");
			int age=s.nextInt();
			
			System.out.println("Enter salary");
			int salary=s.nextInt();
			
			Employee e = new Employee(age,salary,name);
			
			if(age>20) {
				employees[i] = e;
			}
		}
		
		
		System.out.println("Employee details are");
		for(int j=0;j<employees.length;j++) {
			System.out.println(employees[j].getName());
		}
		
		
		
		
		
	}

	
	

}
