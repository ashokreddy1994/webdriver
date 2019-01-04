package com.webdriver;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReRun  {
	@Test(retryAnalyzer=com.webdriver.Retry.class)
		public void method() {
			System.out.println("1");
			Assert.assertEquals(true, false);
		}
	}


