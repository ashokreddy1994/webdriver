package com.webdriver;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class IntArray {
	     
	public static void main(String[] args) {
		 ArrayList<String> a=new ArrayList<String>();
		 a.add("java");
		 a.add("c");
		 a.add(".net");
		 a.add("java");
		 Set<String> s=new HashSet<String>();
		 for(String var:a) {
			if( s.add(var)==false) {
				System.out.println(var);
			}
		 }
		 
	}
}
