package com.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import junit.framework.Assert;

public class Extent_Reports {

	public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
            WebDriver driver=new ChromeDriver();
            ExtentReports er=new ExtentReports("E:\\extentreportfacebook1.html",false);
            ExtentTest et=er.startTest("verify facebook title");
                er.addSystemInfo("Host Name","Ashokreddy");
                er.addSystemInfo("Environment","Automation testing");
                er.addSystemInfo("OS Name", "Windows");
                er.addSystemInfo("User Name", "ASHOKREDDY");
            driver.get("http://www.facebook.com");
            et.log(LogStatus.INFO,"facebook launched");
            String title=driver.getTitle();
            et.log(LogStatus.INFO,"get the title");
            if(title.equals(title)) {
            	et.log(LogStatus.PASS,"test case passed");
            }
            else {
            	et.log(LogStatus.FAIL, "its failed");
            }
            
            String exptitle="Facebook – log in or sign ";
            er.endTest(et);
    		er.flush();
            		Assert.assertEquals(title,exptitle);
            		
            
	}

}
