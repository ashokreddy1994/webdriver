package com.ashok;

import org.testng.annotations.Test;

public class Sample2 {
	@Test
	public void method1() {
		System.out.println(1);
	}
	@Test(enabled=false)
	public void method2() {
		System.out.println(2);
	}
	@Test
	public void method3() {
		System.out.println(3);
	}

}
