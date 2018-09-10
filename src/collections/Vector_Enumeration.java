package collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Vector_Enumeration {

	public static void main(String[] args) {
           Vector<Integer> v=new Vector<Integer>();
             v.add(2);
             v.add(7);
             v.add(1);
             System.out.println(v);
             Enumeration e=v.elements();
             while(e.hasMoreElements()){
            	 System.out.println(e.nextElement());
             }
             Iterator it=v.iterator();
             while(it.hasNext()){
            	 System.out.println(it.next());
             }
	}

}
