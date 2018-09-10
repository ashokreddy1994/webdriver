package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class DuplicateArray {

	public static void main(String[] args) {
         ArrayList<String> a=new ArrayList<String>();
         a.add("2");
         a.add("1");
         a.add("10");
         a.add("10");
         a.add("2");
         System.out.println(a);
       Set<String>  s=new HashSet<>();
       for(String data:a){
    	   if(s.add(data)==false){
    		   System.out.print("["+data+" "+"]");
    	   }
       }
         
	}

}
