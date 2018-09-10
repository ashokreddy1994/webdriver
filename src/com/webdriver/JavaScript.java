package com.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {

	public static void main(String[] args) throws InterruptedException {
          System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
          WebDriver driver=new ChromeDriver();
          driver.get("http://facebook.com");
          driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
          driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
          WebElement e=driver.findElement(By.id("email"));
          JavascriptExecutor js=(JavascriptExecutor)driver;
          js.executeScript("arguments[0].style.border='2px dashed red';",e);
          WebElement e1=driver.findElement(By.id("pass"));
          js.executeScript("arguments[0].setAttribute('disabled',true);",e1);
          js.executeScript("alert('disabled complete');");
          Thread.sleep(3000);
          driver.switchTo().alert().accept();
          js.executeScript("arguments[0].removeAttribute('disabled');",e1);
          js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
          js.executeScript("window.scrollTo(document.body.scrollHeight,0);");
          
	}

}
