package lib;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Screenshot {
	WebDriver driver;
	Logger l=Logger.getLogger(Screenshot.class);
     @Test
     public void launchBrowser() {
    	 PropertyConfigurator.configure("D:\\new eclipse\\webdriver\\src\\lib\\log4j.properties");
    	 System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
    	driver =new ChromeDriver();
    	 driver.get("https:\\www.facebook.com");
    	 l.info("facebook launched");
    	 String actual_title=driver.getTitle();
    	 String exp_title="facebooklaunch";
    	 Assert.assertEquals(actual_title, exp_title);
    	 l.error("titles mismatch");
    	 
     }
     @AfterMethod
     public void tearDown(ITestResult result) throws Exception {
    	 if(ITestResult.FAILURE==result.getStatus()) {
    		 ScreenshotUtility.getSceenshot(driver,"facebook.com");
    		 System.out.println("screenshot taken");
    		 driver.close();
    	 }
     }
}
