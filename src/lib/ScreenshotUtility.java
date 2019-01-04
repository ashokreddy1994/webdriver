package lib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtility {
	public static String getSceenshot(WebDriver driver,String path) throws Exception {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String dest="D:\\"+path+".png";
		File destination=new File(dest);
		FileUtils.copyFile(src,destination);
		return dest;
	}

}
