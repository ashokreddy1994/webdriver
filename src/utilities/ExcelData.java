package utilities;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class ExcelData {

	public static void main(String[] args)  throws Exception{
           File f=new File("D:\\data.xls");
           Workbook rwb=Workbook.getWorkbook(f);
           Sheet rsh=rwb.getSheet(0);
           int rows=rsh.getRows();
           int col=rsh.getColumns();
           WritableWorkbook rb=Workbook.createWorkbook(f, rwb);
           WritableSheet rs=rb.getSheet(0);
           
           for(int i=1;i<rows;i++){
        	   String usr=rsh.getCell(0,i).getContents();
        	   String psd=rsh.getCell(1,i).getContents();
        	   System.out.println(usr);
        	   System.out.println(psd);
        	   System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
        	   WebDriver driver=new ChromeDriver();
        	   driver.get("https://gmail.com");
        	   driver.manage().window().maximize();
        	   driver.findElement(By.name("identifier")).sendKeys(usr);
        	   driver.findElement(By.xpath("//*[text()='Next']")).click();
        	   Thread.sleep(1000);
        	  driver.findElement(By.name("password")).sendKeys(psd);
        	   Label l=new Label(col,i,"Testpassed");
        	   rs.addCell(l);
        	   driver.close(); 
           }
           rb.write();
           rb.close();
           rwb.close();
           
          
	}

}
