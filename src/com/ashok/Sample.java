package com.ashok;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sample {
	@Test
	@Parameters("uid")
	public void method(String x) {
		System.out.println(x);
	}

}
