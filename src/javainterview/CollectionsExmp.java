package javainterview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.testng.Assert;

public class CollectionsExmp {

	public static void main(String[] args) {
		List a = new ArrayList();
		a.add(1);
		a.add(2);
		a.add(3);
		List actual = new ArrayList();
		actual.addAll(a);
		List exp = new ArrayList();
		exp.addAll(a);
		Collections.sort(exp);
		Assert.assertEquals(actual, exp);
		HashMap m = new HashMap();
		m.put(2, "ashok1");
		m.put(2, "ashok");
		m.put(3, "ashok");
		m.put(4, "ashok");
		System.out.println(m);

	}

}
