package com.webdriver;

public class CustomizedExe extends Exception{
	
	CustomizedExe(String str){
		super(str);
	}
	

	public static void main(String[] args) {
		try {
		int a,b,c;
		a=10;
		b=2;
		c=a/b;
		if(c==5) {
		CustomizedExe me=new CustomizedExe("b is greater than 0");
		throw me;
		
		}}
		catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}
