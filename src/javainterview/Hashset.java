package javainterview;

import java.util.HashSet;
import java.util.Set;

public class Hashset {

	public static void main(String[] args) {
           Set<Integer> s=new HashSet();
           s.add(3);
           s.add(4);
           s.add(5);
           s.add(6);
           s.add(7);
           s.remove(7); 
           System.out.println(s);
           for(int a:s) {
        	   System.out.print(a);
           }
	}

}
