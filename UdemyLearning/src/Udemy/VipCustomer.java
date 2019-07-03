package Udemy;

public class VipCustomer {
	private String name;
	private String mailid;
	private int creditlimit;
	
	
	public VipCustomer() {
		this("smitha","smitha.5990@gmail.com",250000);
	}
	
	public VipCustomer(String name,String mailid,int creditlimit) {
		this.name=name;
		this.mailid=mailid;
		this.creditlimit=creditlimit;
	}
	
	public VipCustomer(String name,String mailid) {
		this.name = name;
		this.mailid = mailid;
		this.creditlimit = 25000;
	}
	public String getName() {
		return name;
	}
	public String getMailid() {
		return mailid;
	}
	public int getCreditlimit() {
		return creditlimit;
	}
	
	

}
