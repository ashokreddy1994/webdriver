package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExp {

	public static void main(String[] args) {
           HashMap<Integer,String> map=new HashMap<Integer,String>();
           map.put(1,"Ashok");
           map.put(2,"Asholkckk");
           map.put(4,"Ashokndm");
           System.out.println(map.get(2));
          Set<Integer> s= map.keySet();
          // System.out.println(s);
           Iterator it=s.iterator();
           while(it.hasNext()) {
        	   System.out.println(it.next());
           }
           for(Map.Entry<Integer,String> values:map.entrySet()) {
        	   System.out.println(values.getKey());
           }
	}

}
