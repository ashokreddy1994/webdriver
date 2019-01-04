package com.webdriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AnnotationsEx {
	@Test
	public void testMethod() {
		System.out.println("testlevel method");
	}
	@BeforeMethod
	public void testMethod6() {
		System.out.println("beforemethod method");
	}
	@AfterMethod
	public void testMethod7() {
		System.out.println("aftermethod method");
	}
	
	
	@BeforeClass
	public void testMethod1() {
		System.out.println("classlevel method");
	}
	@BeforeSuite
	public void testMethod2() {
		System.out.println("suitelevel method");
	}
	@AfterSuite
	public void testMethod3() {
		System.out.println("Aftersuite method");
	}
	@AfterClass
	public void testMethod4() {
		System.out.println("afterclass method");
	}
	
	
}
