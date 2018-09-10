package com.webdriver;

public class PrintCharacters {

	public static void main(String[] args) {
                String s="123ab^cHi(&";
             //   char[] ch=s.toCharArray();
                for(int i=0;i<s.length();i++) {
                	char ch1=s.charAt(i);
                	if((ch1>='a'&&ch1<='z')||(ch1>='A'&&ch1<='Z')) {
                		System.out.print(ch1);
                	}
                }
	}

}
