package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {

	public static void main(String[] args) throws InterruptedException {
       System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
       WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        Thread.sleep(2000);
        WebElement e=driver.findElement(By.name("birthday_month"));
        Select s=new Select(e);
        s.selectByIndex(2);
        
        
        
	}

}
