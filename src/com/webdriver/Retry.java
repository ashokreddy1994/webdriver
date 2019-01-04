package com.webdriver;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {
int count=1;
int maxcount=4;

	@Override
	public boolean retry(ITestResult result) {
		if(count<maxcount){
			
		
			count++;
		return true;
		}
		return false;
	}

}
