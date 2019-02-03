package com.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
            WebDriver driver=new ChromeDriver();
               driver.get("https://www.w3schools.com/html/html_tables.asp");
             //*[@id="customers"]/tbody/tr[2]/td[1]
              /* List<WebElement> list=driver.findElements(By.xpath(" //*[@id=\"customers\"]/tbody/tr//td"));
               System.out.println(list.size());
               for(int i=0;i<list.size();i++) {
            	   String x=list.get(i).getText();
            	   System.out.println(x);
               }*/
               String beforexpath="//*[@id=\"customers\"]/tbody/tr[";
               String afterxpath="]/td[2]";
               for(int i=2;i<=7;i++) {
            	   WebElement e=driver.findElement(By.xpath(beforexpath+i+afterxpath));
            	   String s=e.getText();
            	   System.out.println(s);
            	   if(s.contains("Roland Mendel")) {
            		   System.out.println(s+":"+"row is"+"=="+i);
            		   break;
            	   }
               }
               
            
	}

}
