package com.webdriver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Retrival {

	public static void main(String[] args) 
	{
//            HashMap<Integer,String> hm=new HashMap<Integer,String>();
//            hm.put(1,"ashok");
//            hm.put(2,"ashok2");
//            hm.put(3,"ashok1");
//            hm.put(4,"reddy");
//            System.out.println(hm);
//            Set s=hm.entrySet();
//           Iterator i=s.iterator();
//           while(i.hasNext()) {
//        	   Map.Entry<Integer,String> me=(Map.Entry<Integer, String>)i.next();
//        	   int x=(Integer)me.getKey();
//        	   String s1=(String)me.getValue();
//        	   System.out.println(x+"\t"+s1);
//           }
            
		ArrayList<String> a=new ArrayList<String>();
		     a.add("bshok");
		     a.add("reddy");
		     System.out.println(a); 
		     Collections.sort(a);
		     System.out.println(a);
		     Collections.reverse(a);
		     System.out.println(a);
	}

}
