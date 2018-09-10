package javainterview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
               HashMap<Integer,String> h=new HashMap<Integer,String>();
               h.put(1,"java");
               h.put(2,".net");
               h.put(3,"selenium");
               h.put(4,"manual");
               System.out.println(h);
               Set s=h.entrySet();
               Iterator it=s.iterator();
               while(it.hasNext()) {
            	   Map.Entry<Integer,String> m=(Map.Entry<Integer, String>)it.next();
            	   int x=(Integer)m.getKey();
            			   String y=(String)m.getValue();
            			   System.out.println(x);
            			   System.out.println(y);
               }
	}

}
