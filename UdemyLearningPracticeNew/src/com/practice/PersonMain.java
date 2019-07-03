package com.practice;

import java.util.Scanner;

public class PersonMain {
	public static void main(String[]args) {
		Person p=new Person();
		Scanner s=new Scanner(System.in);
		System.out.println("enter firstname,lastname and age of a person");
		String firstname=s.nextLine();
		String lastname=s.nextLine();
		int age=s.nextInt();
		p.setAge(age);
		p.setFirstname(firstname);
		p.setLastname(lastname);
		System.out.println("teen="+p.isteen());
		System.out.println("person's firstname is "+p.getFirstname()+" lastname is "+p.getLastname()+" age is"+p.getAge());
		s.close();
	}

}
