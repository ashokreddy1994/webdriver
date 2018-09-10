package com.webdriver;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Create_Cookie {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.drive","E://chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("http://www.facebook.com");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        Cookie c=new Cookie("ashokreddy","www.facebook.com");
        Cookie ci=new Cookie("reddy","www.facebook.com");
        driver.manage().addCookie(ci);
        driver.manage().addCookie(c);
        Thread.sleep(1000);
        Set<Cookie> s=driver.manage().getCookies();
        System.out.println(s.size());
        for(Cookie co:s){
        	System.out.println(co.getName());
        }
        Cookie coo=driver.manage().getCookieNamed("reddy");
        
        System.out.println(coo.getValue());
        System.out.println(coo.getDomain());
	}

}
