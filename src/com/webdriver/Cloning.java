package com.webdriver;

import java.util.ArrayList;

public class Cloning implements Cloneable{

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		  a.add(2);
		  a.add(3);
		  a.add(4);
		  a.add(5);
		  System.out.println(a);
		  ArrayList a2=(ArrayList)a.clone();
		  System.out.println(a2);
           
	}

}
