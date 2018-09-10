package Properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class GetProperty {

	public static void main(String[] args) throws Exception {
		File f=new File("D:\\new eclipse\\webdriver\\src\\Properties\\ashok.properties");
		FileInputStream fis=new FileInputStream(f);
		Properties p=new Properties();
		p.load(fis);
		System.out.println(p.getProperty("Url"));
             p.setProperty("id","same as");
	}

}
