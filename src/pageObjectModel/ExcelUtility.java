package pageObjectModel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	public static void main(String[] args) throws Exception {
                     File f=new File("C:\\Users\\PC\\Desktop\\data.xlsx");
                     FileInputStream fis=new FileInputStream(f);
                     Workbook wb=WorkbookFactory.create(fis);
                     Sheet s=wb.getSheetAt(0);
                     int rowcount=s.getLastRowNum();
                     for(int i=0;i<=rowcount;i++) {
                    	 int colcount=s.getRow(i).getLastCellNum();
                    	 for(int j=0;j<colcount;j++) {
                    		 
                    	 
                    	 String data=s.getRow(i).getCell(j).getStringCellValue();
                    	 System.out.print(" "+data);}
                     }
	}

}
