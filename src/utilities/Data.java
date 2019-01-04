package utilities;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

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
	@Test(dataProvider="multiple")
	public void method(String x,String y) {
		System.out.println(x);
		System.out.println(y);
	}

}