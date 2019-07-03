package com.practice;

public class Person {
	private String firstname;
	private String lastname;
	private int age;
	
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if((age<0)||(age>100)) {
			this.age=0;
		}
		else {
		this.age = age;
		}
		
	}
	public boolean isteen() {
		if((age>12)&&(age<20)) {
			return true;
		}
		else {
			return false;
		}
	}
	public String getfullname() {
		if((firstname.isEmpty())&&(lastname.isEmpty())) {
			return "";
		}		
		else if(firstname.isEmpty()) {
			return this.lastname;
		}
		else {
			return this.firstname;
		}
	}

}
