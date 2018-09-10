package com.webdriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class IncludeMethods {
	@BeforeMethod
	public void beforemethod() {
		System.out.println("beforemethod");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("aftertest");
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("beforetest");
	}
	@Test
	@Parameters("sal")
	public void test1(String x) {
		System.out.println(x);
		System.out.println("test1");
	}
	@Test
	public void test12() {
		System.out.println("test2");
	}
	@Test
	public void test13() {
		System.out.println("test3");
	}

}
