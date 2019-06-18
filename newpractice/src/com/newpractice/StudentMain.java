package com.newpractice;

public class StudentMain {
	
	public static void main(String[]args) {
		StudentService service = new StudentService();
		Student[] studArray = service.readstudent();
		service.display(studArray);
	}

}
