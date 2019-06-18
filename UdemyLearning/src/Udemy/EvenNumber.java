package Udemy;

import java.util.Scanner;

public class EvenNumber {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int n=s.nextInt();
		evennumber(n);
		s.close();
	}
	public static void evennumber(int n) {
		int count=0;
		while(n!=20) {
			if(n%2==0) {
				System.out.println(n+" is an even number");
				count=count+1;
				if(count==5) {
					break;
				}				
			}
			n++;
		}
		System.out.println(count+" even numbers are found");
	}

}
