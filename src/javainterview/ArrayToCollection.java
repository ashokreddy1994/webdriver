package javainterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import oracle.net.aso.e;

public class ArrayToCollection {

	public static void main(String[] args) {
            int [] a= {3,4,5,3,9};
             List l= new ArrayList(Arrays.asList(a));
             l.add(3);
             l.add(4);
             l.add(5);
             l.add(3);
             l.add(9);
             Iterator it=l.iterator();
             while(it.hasNext()) {
            	 System.out.println(it.next());
             }
	}

}
