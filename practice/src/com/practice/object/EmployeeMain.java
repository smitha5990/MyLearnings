package com.practice.object;


public class EmployeeMain {
	
	
	
	public static void main(String [] args) {
		
		Employee [] empArray = new Employee[10];
				
		Employee e1 = new Employee(20,"Smitha");
	
		
		Address addr = new Address();
		addr.firstLine = "White Field";
		addr.city = "Bangalore";
		addr.pincode = 560066;
		
		
		
		empArray[0] = e1;
		
		System.out.println("Employee details are");
		
		for(int i =0; i< empArray.length;i++) {
			
			if(empArray[i]!=null) {
				
				System.out.println("Name :"+empArray[i].getName());
				System.out.println("Age :"+empArray[i].getAge());
				
			}
			
			
			
		}
		
		
		
	}

}
