package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data1 {
	WebDriver driver;
	
	@BeforeMethod
		public void launch() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://www.gmail.com");
			driver.manage().window().maximize();
			Thread.sleep(3000);
		}
		@DataProvider(name="Loginvalues")
		public Object[][] getData() 
		{
			Object[][] data=new Object[3][2];
			data[0][0]="bhai0raju";
			data[0][1]="raju3333";
			data[1][0]="bhai0raju";
			data[1][1]="raju3333";
			data[2][0]="bhai0raju";
			data[2][1]="raju3333";
			
			return data;
			
		}
		@Test(dataProvider="Loginvalues")
		public void login(String u,String p) throws InterruptedException 
		{        Thread.sleep(3000);
			driver.findElement(By.name("identifier")).sendKeys(u);
			driver.findElement(By.id("identifierNext")).click();
			Thread.sleep(3000);
			 driver.findElement(By.name("password")).sendKeys(p);
	    	 driver.findElement(By.id("passwordNext")).click();
	    	 Thread.sleep(2000);
	    	 
		}
		@AfterMethod
		public void close(){
			driver.close();
		}}
