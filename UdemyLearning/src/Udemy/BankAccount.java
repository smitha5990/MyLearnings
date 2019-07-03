package Udemy;

public class BankAccount {
	private String customername;
	private String mailid;
	private int accountnumber;
	private int balance;
	private long phonenumber;
	
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public int getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	public int depositfunds(int funds) {
		int totalbalance=balance+funds;
		System.out.println("total balance is "+totalbalance);
		return totalbalance;
	}
	public int withdrawlfunds(int funds) {
		int totalbalance;
		if(funds<balance) {
			totalbalance=balance-funds;
			System.out.println("total balance is "+totalbalance);
		}
		else {
			totalbalance=balance;
			System.out.println("insufficient balance");
		}
		return totalbalance;
	}
	
}
