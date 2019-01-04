package collections;

import java.util.Hashtable;
import java.util.Map;

public class Hash_table {

	public static void main(String[] args) {
          Hashtable<Integer,String> hm=new Hashtable<Integer,String>();
           hm.put(1,"ashok");
           hm.put(3,"ashok");
           hm.put(2,"ashok");
           hm.put(4,"ashok");
        //   System.out.println(hm);
         //  System.out.println(hm.remove(4));
         //  System.out.println(hm.size());
           for(Map.Entry m:hm.entrySet()){
        	   System.out.println(m.getKey()+" "+m.getValue());
           }
           
	}

}
