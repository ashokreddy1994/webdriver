package com.webdriver;

import java.util.ArrayList;
class Parent{
	public Parent(){
		System.out.println("parent");
	}
}

public class CCC extends Parent {
	public CCC(){
		super();
		System.out.println("child");
	}

	public static void main(String[] args) {
		Parent p=new Parent();
		CCC c=new CCC();
		p=c;
		
		
	
		
             	}

}
