package com.webdriver;

public class Counter {

	public static void main(String[] args) {
//           String s="aaaashok";
//           int counter=0;
//           for(int i=0;i<s.length();i++) {
//        	   if(s.charAt(i)=='a') {
//        		   counter=counter+1;
//        	   }
//           }
//           System.out.println("the number of occurrence of a="+counter);
		
		
		String s="mahesh";
		char[] c=s.toCharArray();
		int sz=c.length;
		int counter=0;
		for(int i=0;i<sz;i++)
		{
			counter=0;
			for(int j=0;j<sz;j++) 
			{
				if(c[i]==c[j])
				{
					counter=counter+1;
				}
			}
			System.out.println("the occurrence of "+c[i]+ "="+counter);
		}
		
	}

}
