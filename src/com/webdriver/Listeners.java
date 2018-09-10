package com.webdriver;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
        System.out.println("testing started");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		if(ITestResult.SUCCESS==result.getStatus()){
			System.out.println("testpassed"+result.getName());
			System.out.println("testpassed"+result.getInstance());
		}
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
        if(ITestResult.FAILURE==result.getStatus())	{
        	System.out.println(result.getName());
        }
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	

}
