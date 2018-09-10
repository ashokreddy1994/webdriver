package com.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Para {
	@Parameters({"uid","psd"})
    @Test
    public void launch(String x,String y){
    	System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
    	System.out.println(x);
    	System.out.println(y);
    }
}
