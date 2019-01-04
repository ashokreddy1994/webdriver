package lib;

public class ExcelReader {

	public static void main(String[] args) throws Exception {
          ExcelConfig excel=new ExcelConfig("C:\\Users\\PC\\Desktop\\data.xlsx");
        String data=  excel.getData(0, 2, 2);
        System.out.println(data);
	}

}
