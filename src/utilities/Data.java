package utilities;

import org.testng.annotations.DataProvider;

public class Data {
	@DataProvider(name="multiple")
	public Object[][] getData(){
		Object[][] data=new Object[3][2];
   				
		data[0][0]="bhai0raju";
		data[0][1]="raju3333";
		data[1][0]="bhai0raju";
		data[1][1]="raju3333";
		data[2][0]="bhai0raju";
		data[2][1]="raju3333";
		
		return data;
		
	}

}