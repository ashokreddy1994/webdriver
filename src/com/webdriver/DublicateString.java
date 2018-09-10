package com.webdriver;

public class DublicateString {

	public static void main(String[] args) {
               /* String s="ashokreddy";
                char[] c=s.toCharArray();
                for(int i=0;i<c.length;i++) {
                	for(int j=i+1;j<c.length;j++) {
                		if(c[i]==c[j]) {
                			System.out.println(c[j]);
                		}
                	}
                }*/
		
		String s="ashokreddyyyd";
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					System.out.println(s.charAt(j));
				}
			}
		}
	}

}
