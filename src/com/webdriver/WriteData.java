package com.webdriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteData {

	public static void main(String[] args) throws Exception {
              //  File f=new File("D:\\123.xlsx");
                FileInputStream fis=new FileInputStream("D:\\123.xlsx");
                Workbook wb=WorkbookFactory.create(fis);
                Sheet sh=wb.getSheetAt(0);
                Row r=sh.createRow(0);
                Cell c=r.createCell(0);
                      c.setCellValue("ashok");
                      FileOutputStream fos=new FileOutputStream("D:\\123.xlsx");
                      wb.write(fos);
                      fos.close();
                
	}

}
