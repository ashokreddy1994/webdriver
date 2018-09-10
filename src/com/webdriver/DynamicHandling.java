package com.webdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicHandling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.spicejet.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//  Thread.sleep(2000);
		 driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		 List<WebElement> l=driver.findElements(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr//td/a"));
		 System.out.println(l.size());
		 for(int i=0;i<l.size();i++) {
			 String date=l.get(i).getText();
			 if(date.equalsIgnoreCase("28")) {
				 l.get(i).click();
				 break;
			 }
		 }
	}

}
