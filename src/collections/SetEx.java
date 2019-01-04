package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx {

	public static void main(String[] args) {
		Set s = new HashSet();
		s.add("1");
		s.add("2");
		s.add("3");
		Iterator i = s.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
 