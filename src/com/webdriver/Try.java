package com.webdriver;

public class Try {

	public static void main(String[] args) {
                try {
                	try {
                		throw new Exception("simple exception");
                	}
                	finally {
                		System.out.println("hi finally1");
                	}
                }
                catch(Exception e) {
                	System.out.println("hi catch1");
                }
                finally {
                	System.out.println("hi finally2");
                }
	}

}
