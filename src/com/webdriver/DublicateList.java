package com.webdriver;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DublicateList {

	public static void main(String[] args) {
         ArrayList a=new ArrayList();
         
             a.add("a");
             a.add("a"); 
             a.add("b");
             a.add("c");
             a.add("d");
             a.add("c");
             Set s=new HashSet(a);
             for(int i=0;i<a.size();i++) {
            	 for(int j=0;j<s.size();j++) {
            		 if(a.get(i)==s.iterator()) {
            			 System.out.println(i);
            		 }
            	 }
             }
	}

}
