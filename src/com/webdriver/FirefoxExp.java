package com.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxExp {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
              WebDriver driver=new FirefoxDriver();
              driver.get("http://www.durgasoft.com");
              driver.manage().window().maximize();
	}

}
