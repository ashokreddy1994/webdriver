package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashImp {

	public static void main(String[] args) {
           Set<String>  s=new LinkedHashSet<String>();
            s.add("ashok");
            s.add("reddy");
            s.add("ashok");
            System.out.println(s);
            for(String data:s){
            	System.out.println(data);
            	
            }
            System.out.println(s.size());
            System.out.println(s.isEmpty());
	}

}
