package com.webdriver;

public class StringCapital {

	public static void main(String[] args) {
               String s="ashokReddy sinGareddy";
               String word[]=s.split("\\s");
               String data="";
               for(String s1:word) {
            	   String first=s1.substring(0,1);
            	   String remaining=s1.substring(1);
            	   
            	   data=data+first.toUpperCase()+remaining.toLowerCase()+" ";
               }
               System.out.println(data);
	}

}
