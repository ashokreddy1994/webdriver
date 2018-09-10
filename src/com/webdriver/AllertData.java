package com.webdriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AllertData {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.spicejet.com");
		Cookie co=new Cookie("ashok","ashok.reddy");
		driver.manage().addCookie(co);
		Cookie co1=driver.manage().getCookieNamed("ashok");
		co1.validate();
         	}

}
