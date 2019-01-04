package com.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Spicejet {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		//Actions a=new Actions(driver);
		//WebElement e=driver.findElement(By.xpath("//*[@id='familyandfriend']/label"));
		
		//a.moveToElement(e).build().perform();
		//driver.manage().window().maximize();
		String data=driver.findElement(By.xpath("//*[@id='familyandfriend']/a/span")).getText();
		System.out.println(data);
		System.out.println("ashok");
	}

}
