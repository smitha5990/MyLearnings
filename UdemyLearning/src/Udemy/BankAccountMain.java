package Udemy;

import java.util.Scanner;

public class BankAccountMain {
	public static void main(String args[]) {
		BankAccount details=new BankAccount();
		Scanner s=new Scanner(System.in);
		System.out.println("enter the customer's name ");
		String name=s.nextLine();
		System.out.println("enter mail id");
		String mailid=s.nextLine();
		System.out.println("enter account number");
		int accnumber=s.nextInt();
		System.out.println("enter phone number");
		long phnumber=s.nextLong();
		System.out.println("enter the balance");
		int balance=s.nextInt();
		details.setCustomername(name);
		details.setAccountnumber(accnumber);
		details.setPhonenumber(phnumber);
		details.setMailid(mailid);
		details.setBalance(balance);
		System.out.println("enter the amount to deposit or to withdraw");
		int funds=s.nextInt();
		System.out.println("Enter 1 to deposit and enter 2 to withdraw");
		int n=s.nextInt();
		if(n==1) {
			int deposits=details.depositfunds(funds);
		}
		else if(n==2) {
			int withdrawl=details.withdrawlfunds(funds);
		}
		else {
			System.out.println("entered wrong number");
		}
		s.close();
	}

}
