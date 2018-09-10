package javainterview;

import java.util.LinkedList;
import java.util.List;

public class Linked {

	public static void main(String[] args) {
          LinkedList l=new LinkedList();
           l.add(9);
           l.add(4);
           l.add(3);
           l.addFirst(2);
           l.set(2,11);
           l.add(2,12);
           l.remove(2);
           l.remove("11");
           System.out.println(l);
	}
	

}
