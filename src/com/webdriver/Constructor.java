package com.webdriver;

class Ashok {
	public Ashok() {
		System.out.println("default constructor");
	}

	protected Ashok(int i) {
		System.out.println(i + "ashokreddys");
	}

}

public class Constructor extends Ashok {
	Constructor(int i) {

		System.out.println(i);
	}

	public static void main(String[] args) {
		Constructor c = new Constructor(5);
	}
}
