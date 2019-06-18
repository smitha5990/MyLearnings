package com.newpractice;

import java.util.Scanner;

public class StudentService {
	
	public Student[]  readstudent() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number of students");
		int n=s.nextInt();
		Student[]a=new Student[n];
		for(int i=0;i<n;i++) {
			s.nextLine();
			System.out.println("enter name");
		    String name=s.nextLine();
		    System.out.println("enter age");
		    int age=s.nextInt();
		    Student st=new Student();
		    st.name=name;
		    st.age=age;
		    a[i]=st;
		}
		return a;
		
	}

	public void display(Student[]st) {
		System.out.println("entered details are");
		for(int i=0;i<st.length;i++) {
			if(st[i].age<30) {
				System.out.println("student name is "+st[i].name);
				System.out.println("student age is "+st[i].age);
			}
		}
	}
}
