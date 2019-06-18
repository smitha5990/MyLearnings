package com.practice;

public class palindrome {
	
	
	public void checkStringisPalindrome(String a) {
		String b="";
		for(int i=a.length()-1;i>=0;i--) {
		b=b+a.charAt(i);
		}
		if(b.equals(a)) {
			System.out.println("is a palindrome");
		}
		else {
			System.out.print("not a palindrome");
		}
	}

}
