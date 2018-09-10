package com.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utilities.Data;

public class Gmail extends Data{
	
	@Test(dataProvider="multiple")
	public void launch(String us,String ps){
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		System.out.println(us);
		System.out.println(ps);
		
	}

}
