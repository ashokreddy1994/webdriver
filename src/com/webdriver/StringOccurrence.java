package com.webdriver;

public class StringOccurrence {

	public   int count(String s,char c){
		int res=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==c)
				res++;
		}
		return res;
		
	}
	public static void main(String[] args) {
		StringOccurrence sc=new StringOccurrence();
		int x=sc.count("ashokreeddy",'e');
		System.out.println(x);
	}

}
