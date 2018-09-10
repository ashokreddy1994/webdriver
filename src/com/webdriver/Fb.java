package com.webdriver;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.Screenshot;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

 @org.testng.annotations.Listeners(Listeners.class)
public class Fb {

	@Test(retryAnalyzer=Retry.class)
	public void launch() throws IOException{
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
 WebDriver driver=new ChromeDriver();
     driver.get("https://www.facebook.com");
   //  Assert.assertTrue(false);
 String img= Screenshot.takesScreenshot(driver, "realFB");
       System.out.println("screenshot taken");
       ExtentReports er=new ExtentReports("D:\\extent.html",true);
       er.addSystemInfo("USER NAME","ASHOK");
       ExtentTest et=er.startTest("Facebook test started");
       Assert.assertTrue(true);
       et.log(LogStatus.PASS, "test passed");
       et.log(LogStatus.INFO,"success");
       et.log(LogStatus.FAIL,et.addScreenCapture(img));
       er.flush();
       er.endTest(et);
       System.out.println(driver.getCurrentUrl());
       System.out.println(driver.getTitle());
       driver.close();
       
       
     
	}

}
