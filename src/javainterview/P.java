package javainterview;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class P {

	public static void main(String[] args) throws Exception {
            File f=new File(".\\Values.properties");
            FileInputStream fis=new FileInputStream(f);
            Properties p=new Properties();
            p.load(fis);
            System.out.println(p.getProperty("username"));
            System.out.println(p.getProperty("password"));
           
	}

}
