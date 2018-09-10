package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageElements {

	public WebDriver driver;
	@FindBy(name="email")
	public WebElement username;
	@FindBy(name="pass")
	public WebElement password;
	@FindBy(id="loginbutton")
	public WebElement Loginbutton;
	public PageElements(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public  void enterCredentials(String str1,String str2) {
		username.sendKeys(str1);
		password.sendKeys(str2);
		Loginbutton.click();
		
	}
	
	
}
