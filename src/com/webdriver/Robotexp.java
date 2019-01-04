package com.webdriver;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Robotexp {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement e = driver.findElement(By.name("email"));
		Thread.sleep(2000);
		/*
		 * Robot r=new Robot(); r.keyPress(KeyEvent.VK_A); r.keyRelease(KeyEvent.VK_A);
		 * r.keyPress(KeyEvent.VK_S); r.keyRelease(KeyEvent.VK_S);
		 * r.keyPress(KeyEvent.VK_H); r.keyRelease(KeyEvent.VK_H);
		 * r.keyPress(KeyEvent.VK_O); r.keyRelease(KeyEvent.VK_O);
		 * r.keyPress(KeyEvent.VK_K); r.keyRelease(KeyEvent.VK_K);
		 */
		// JavascriptExecutor js=(JavascriptExecutor)driver;
		// js.executeScript("arguments[0].value='ashok';",e);
		// Thread.sleep(3000);
		e.sendKeys("ashok");
		String text = driver.findElement(By.className("placeholder")).getText();
		System.out.println(text);
		List<WebElement> l = driver.findElements(By.xpath("//a"));
		System.out.println(l.size());
		for (WebElement w : l) {
			String s = w.getAttribute("href");
			System.out.println(s);
			

		}
		Select se = new Select(driver.findElement(By.id("month")));
		List<WebElement> le = se.getOptions();
		for (int i = 0; i < le.size(); i++) {
			String dr = le.get(i).getAttribute("value");
			System.out.println(dr);
		}

	}

}
