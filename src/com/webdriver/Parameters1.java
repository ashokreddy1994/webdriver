package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameters1 {
	@Parameters({"username"})
	@Test
	public void launch(String usr) throws Throwable{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println(usr);
		  driver.get("https://www.gmail.com");
		  driver.findElement(By.name("identifier")).sendKeys(usr);
   	   driver.findElement(By.xpath("//*[text()='Next']")).click();
   	   Thread.sleep(1000);
   	//  driver.findElement(By.name("password")).sendKeys(psd);
	}

}
