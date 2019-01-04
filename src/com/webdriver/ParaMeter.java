package com.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParaMeter {
	WebDriver driver;
	//@BeforeClass
	@Test
	@Parameters("browser")
	public void launchBrowser(String browser) {
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
			driver =new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		driver.get("http://www.durgasoft.com");
		String actual_title=driver.getTitle();
		System.out.println(actual_title);
		
		}
	@AfterMethod
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(10000);
	driver.close();
}

//		String Exp_title="";
//		Assert.assertEquals(actual_title, Exp_title);
		
}
