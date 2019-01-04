package lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Spicejet {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
          WebDriver driver=new ChromeDriver();
          driver.get("https:\\www.spicejet.com");
        //  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
          Thread.sleep(10);
         /* driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
          
     List<WebElement> l=    driver.findElements(By.xpath("//div[@class='dropdownDiv']/ul/li/a"));
            System.out.println(l.size());
            for(WebElement e:l) {
            	System.out.println(e.getText());
            }*/
       String e=   driver.findElement(By.id("familyandfriend")).getAttribute("title");
       System.out.println(e);
    /*   Actions a=new Actions(driver);
       a.moveToElement(e).build().perform();
       WebElement e1=driver.findElement(By.xpath("//span[contains(text(),'Family and Friends')]"));
          System.out.println(e1.getText());
          System.out.println(e.getText());*/
	}

}
