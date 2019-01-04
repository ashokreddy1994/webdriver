package lib;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yatra {

	public static void main(String[] args) {
                   System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
                   WebDriver driver=new ChromeDriver();
                   driver.get("https:\\www.yatra.com");
                   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
                   
               List<WebElement> l=driver.findElements(By.xpath("//div[@class='ac_results origin_ac']//ul//li"));
               System.out.println(l.size());
	}

}
