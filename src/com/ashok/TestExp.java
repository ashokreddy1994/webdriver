package com.ashok;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestExp {
	@Test(invocationCount=3)
	public void method1()
	{
		System.out.println("method1");
		//Reporter.log("method1 completed");
	}

	
}
