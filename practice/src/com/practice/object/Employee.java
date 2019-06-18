package com.practice.object;

public class Employee {
	
	
	private int age;
	private String name;
	private Address addess;
	private String gender;
	
	public Employee(int age, String name) {
		this.age =age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		if("M".equalsIgnoreCase(gender)){
			setName("Mr"+getName());
		}
		else {
			setName("Ms"+getName());
		}
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddess() {
		return addess;
	}

	public void setAddess(Address addess) {
		this.addess = addess;
	}
	
	
}
