package lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcel {

	public static void main(String[] args) throws Exception {
		 File f=new File("C:\\Users\\PC\\Desktop\\data.xlsx");
         FileInputStream fis=new FileInputStream(f);
         Workbook wb=WorkbookFactory.create(fis);
         Sheet s=wb.getSheetAt(0);
         s.getRow(0).createCell(3).setCellValue("pass");
         s.getRow(1).createCell(3).setCellValue("pass");
         s.getRow(2).createCell(3).setCellValue("fail");
         FileOutputStream fout=new FileOutputStream(f);
         wb.write(fout);
         wb.close();
        
	}

}
