package com.webdriver;

public class ReverseOfNumber {

	public static void main(String args[]) {
			int a=545;
			int rev=0;
			while(a!=0)
			{
				rev=rev*10+a%10;
				a=a/10;
			}
			if(rev==a){
				System.out.println("it is palindrome");
				}
			System.out.println(rev);
			System.out.println(256/10);
			System.out.println(256%10);
	}

}
