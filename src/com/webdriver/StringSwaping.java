package com.webdriver;

public class StringSwaping {

	public static void main(String[] args) {
		 String s="ashok";
         String s1="reddy";
         s=s+s1;// ashokreddy
         System.out.println(s.length());
         System.out.println(s.substring(0, 0));
         s1=s.substring(0,s.length()-s1.length());
         System.out.println(s1);
         s=s.substring(s1.length());
         System.out.println(s);
         System.out.println(s1);

	}

}
