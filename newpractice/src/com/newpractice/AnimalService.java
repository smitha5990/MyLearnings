package com.newpractice;

import java.util.Scanner;

public class AnimalService {
	
	
	public Animal[] readdomesticanimal() {
		Scanner s=new Scanner (System.in);
		System.out.println("enter the number of animals");
		int n=s.nextInt();
		Animal[]a=new Animal[n];
		for(int i=0;i<n;i++) {
			s.nextLine();
			System.out.println("enter name");
			String na=s.nextLine();
			System.out.println("enter height");
			int h=s.nextInt();
			System.out.println("enter weight");
			int w=s.nextInt();	
			Animal al=new Animal();
			al.name=na;
			al.height=h;
			al.weight=w;
			a[i]=al;
		}
		s.close();
		return a;
	}
	public void Displayanimal(Animal[]al){
		System.out.println("entered details are");
		for(int i=0;i<al.length;i++) {
			System.out.println("name is"+al[i].name);
			System.out.println("height is"+al[i].height);
			System.out.println("weight is"+al[i].weight);
		}
	}
}
