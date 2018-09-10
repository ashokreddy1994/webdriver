package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	public WebDriver driver;
	public static String takesScreenshot(WebDriver driver,String name) throws IOException{
		 File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 String Screen="D:\\"+name+".png";
		 File Dest=new File(Screen);
		 FileUtils.copyFile(src, Dest);
		return Screen;
	}

}
