package com.webdriver;

import java.util.ArrayList;
import java.util.Iterator;

public class Dummy {

	public static void main(String[] args) {
                 /* ArrayList a=new ArrayList();
                  a.add("10");
                  a.add("10");
                  a.add("10");
                  a.add("10");
                  Iterator i=a.iterator();
                  while(i.hasNext()) {
                	  System.out.println(i.next());
                  }
                  a.add("12");
*/
		
	     /* String s="welcome to the hexaware@123.com" ;
	         s=s.toLowerCase();
	         System.out.println(s.length());
	         int vowels=0,consonts=0,digits=0,spaces=0;
	         for(int i=0;i<s.length();i++) {
	        	 char ch=s.charAt(i);
	        	 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
	        		    vowels=vowels+1;
	        	 }
	        	 else if((ch>='a'&&ch<='z')) {
	        		 consonts=consonts+1;
	        		 
	        	 }
	        	 else if(ch>='0'&&ch<='9') {
	        		 digits=digits+1;
	        	 }
	        	 else if(ch==' ') {
	        		 spaces=spaces+1;
	        	 }
	         }
	            System.out.println(vowels);
	            System.out.println(consonts);
	            System.out.println(digits);
	            System.out.println(spaces);
	            System.out.println(vowels+consonts+digits+spaces);
	*/
	     String s="ash  o k ";
	     System.out.println(s);
	     s=s.replaceAll("\\s","");
	     System.out.println(s);
	
	}
	

}
