package lib;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelConfig {
          
	public  FileInputStream fis;
	public    Workbook wb;
	public Sheet s;
	public ExcelConfig(String filepath) throws Exception {
		  File f=new File(filepath);
           fis=new FileInputStream(f);
           wb=WorkbookFactory.create(fis);
          
        
	}
	public String getData(int sheetnum,int row,int col) {
		s=wb.getSheetAt(sheetnum);
		String data=s.getRow(row).getCell(col).getStringCellValue();
		return data;
	}
}
