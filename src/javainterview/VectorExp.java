package javainterview;

import java.util.Enumeration;
import java.util.Vector;


public class VectorExp {

	public static void main(String[] args) {
             Vector<String> v=new Vector<String>();
             v.add("ashok");
             v.add("ashok");
             v.add("ashok");
             v.add("ashok");
             Enumeration<String> e=v.elements();
             while(e.hasMoreElements()) {
            	// System.out.println(e.nextElement());
            	 String s=(String)e.nextElement();
            	 System.out.println(s);
             }
             
	}

}
