package javainterview;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdowns {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
	    	WebDriver driver =new ChromeDriver();
	    	 driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
	    	 Thread.sleep(10);
	    	 driver.switchTo().frame("iframeResult");
	    	 WebElement e=driver.findElement(By.name("cars"));
	    	 
	    	Select s=new Select(e);
	    	/*System.out.println(s.isMultiple());
	    	System.out.println(s.getOptions().size());
	    	s.selectByVisibleText("Volvo");
	    	s.selectByVisibleText("Saab");*/
                   Actions a=new Actions(driver);
                   a.keyDown(Keys.CONTROL).build().perform();
                   Thread.sleep(10);
                   a.click(s.getOptions().get(0)).build().perform();
                   a.click(s.getOptions().get(1)).build().perform();
                   Thread.sleep(10);
                   a.keyUp(Keys.CONTROL).build().perform();
	
}}
