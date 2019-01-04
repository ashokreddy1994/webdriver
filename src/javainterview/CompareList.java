package javainterview;

import java.util.ArrayList;

public class CompareList {

	public static void main(String[] args) {
//           ArrayList a=new ArrayList();
//           a.add(1);
//           a.add(15);
//           a.add(9);
//           a.add(8);
//           ArrayList b=new ArrayList();
//           b.add(8);
//           b.add(3);
//           b.add(9);
//         ArrayList comman=new ArrayList(a);
//         comman.retainAll(b);
//         System.out.println(comman);
		ArrayList al=new ArrayList();
		al.add("ashok");
		al.add("kkk");
		al.removeAll(al);
		System.out.println(al);
	}

}
