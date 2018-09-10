package com.webdriver;

public class ReverseInt {

	public static void main(String[] args) {
         int number=323;
       int  original =number;
         int temp=0;
         int reverse=0;
         while(number>0) {
        	 temp=number%10;
        	 reverse=reverse*10+temp;
        	 number=number/10;
         }
         System.out.println(reverse);
         if(original==reverse) 
        	 System.out.println("palindrome");
         else 
        	 System.out.println("it is not palindrome");
	}

}
