package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrList {

	public static void main(String[] args) {
                 ArrayList<String> a=new ArrayList<String>();
                 a.add("ashok");
                 a.add("reddy");
                 a.add("reddy");
                 System.out.println(a);
                 for(String b:a){
                	 
                 }
                 Iterator it=a.iterator();
                 while(it.hasNext()){
                	 System.out.println(it.next());
                 }
                 System.out.println(a.get(2));
                 System.out.println(a.size());
                 a.add(2,"kishore");
                 System.out.println(a.size());
                 System.out.println(a.contains("reddy"));
                 Collections.sort(a);
                 System.out.println(a);
              
	}

}
