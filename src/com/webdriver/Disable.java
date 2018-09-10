package com.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disable {

	public static void main(String[] args) {
          System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
          WebDriver driver=new ChromeDriver();
          driver.get("http://www.facebook.com");
          int visible=0;
          List<WebElement> list=driver.findElements(By.xpath("//a"));
          System.out.println(list.size());
          for(int i=0;i<list.size();i++)
          {
        	  if(list.get(i).isDisplayed())
        	  {
        		  visible=visible+1;
        		 // System.out.println(list.get(i).getText());
        	  }
        	  else if(list.get(i).isEnabled()==false){
        		  System.out.println(list.get(i).getText());
        	  }
          }
          System.out.println(visible);
          WebElement e=driver.findElement(By.id("email"));
          JavascriptExecutor js=(JavascriptExecutor)driver;
          js.executeScript("arguments[0].setAttribute('disabled',true);",e);
          System.out.println(driver.findElement(By.id("email")).isEnabled());//false
          System.out.println(driver.findElement(By.id("email")).isDisplayed());//true
          System.out.println(driver.findElement(By.id("email")).isSelected());//false
          driver.switchTo().activeElement().sendKeys("ashok");
	}

}
