package collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkArrList {

	public static void main(String[] args) {
               LinkedList<String> a=new LinkedList<String>();
                a.add("ashok");
                a.add("reddy");
                a.addFirst("singareddy");
                System.out.println(a);
                a.addLast("papayapalem");
                System.out.println(a);
                System.out.println(a.hashCode());
               ListIterator<String> it= a.listIterator();
               while(it.hasPrevious()){
            	   System.out.println(it.previous());
               }
            /*  System.out.println( a.getLast());
              System.out.println(a.getFirst());
              System.out.println(a.isEmpty());
              System.out.println(a.get(3));*/
	}

}
