package com.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DatePicker {
@Test
public void selectDate(){
	System.setProperty("webdriver.chrome.driver","E:/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.spicejet.com");
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement ele=driver.findElement(By.name("ctl00$mainContent$view_date1"));
	JavascriptExecutor js=((JavascriptExecutor)driver);
	js.executeScript("arguments[0].value='30-9-2018';", ele);
	//driver.close();
}
}
