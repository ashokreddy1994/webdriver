package com.webdriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertieExample {

	public static void main(String[] args) throws IOException {
       // System.setProperty("webdriver.chrome.driver","E://chromedriver.exe");
       // WebDriver driver=new ChromeDriver();
       File f=new File("D:\\new eclipse\\webdriver\\src\\com\\webdriver\\gmail.properties");
       FileOutputStream fis=new FileOutputStream(f);
       Properties p=new Properties();
       p.setProperty("ashok1","reddy");
       p.store(fis, "hi");
       
       
	}

}
