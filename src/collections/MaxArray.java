package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MaxArray {

	public static void main(String[] args) {
       ArrayList<Integer> a=new ArrayList<Integer>();
           a.add(10);
           a.add(13);
           a.add(90);
           
           Collections.sort(a);
           System.out.println(a);
           System.out.println(" the max value is"+Collections.max(a));
           
         Iterator<Integer> i= a.iterator();
         while(i.hasNext()){
        	 System.out.println(i.next());
         }
	}

}
