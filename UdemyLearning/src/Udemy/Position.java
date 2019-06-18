package Udemy;

public class Position {
	
	public static void main (String[]args) {
		int hsp=chsp(1500);
		dhsp("smitha",hsp);
		
		hsp=chsp(900);
		dhsp("ganesh",hsp);
		
		hsp=chsp(400);
		dhsp("smit",hsp);
		
	    hsp=chsp(90);
		dhsp("gan",hsp);
		
		
	
		
	}
	public static void dhsp(String s,int hsp) {
		System.out.println(s+" has mananged to get into position "+hsp);		
	}
	public static int chsp(int score) {
	
		if(score>1000) {
			return 1;
			}
		else if((score>500)&&(score<1000)) {
			return 2;
			}
		else if((score>100)&&(score<500)) {
			return 3;
			}
		else {
			return 4;
			}
	}

}
