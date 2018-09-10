package com.webdriver;

import java.util.ArrayList;
import java.util.Collections;

public class SortingofArraylist {

	public static void main(String[] args) {
                   ArrayList al=new ArrayList();
                   al.add("20");
                   al.add("90");
                   al.add("40");
                   al.add("-1");
                   System.out.println(al);
                   Collections.sort(al);
                   System.out.println(al);
                   Collections.sort(al, Collections.reverseOrder());
                   System.out.println(al);
	}

}
