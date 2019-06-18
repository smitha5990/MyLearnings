package com.practice.object;

public class studentmain {
	
	public static void main(String [] args) {
		
		student[] sa=new student[10];
				
		student s1 =new student();
		s1.name="smitha";
		s1.age=17;
		s1.std=10;
		
		student s2=new student();
		s2.name="ganesh";
		s2.age=22;
		s2.std=10;
		
		sa[0]=s1;
		sa[1]=s2;
		
		for(int i=0;i<sa.length;i++) {
			if(sa[i]!=null && sa[i].age>20) {
				System.out.println("name:"+sa[i].name);
				System.out.println("age:"+sa[i].age);
				System.out.println("std:"+sa[i].std);
			}
		}
		
		
		
		
	}

}
