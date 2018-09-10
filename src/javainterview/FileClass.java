package javainterview;

import java.io.File;

public class FileClass {

	public static void main(String[] args) {
           File f=new File("D:\\write.txt");
           System.out.println(f.exists());
           System.out.println(f.length());
           System.out.println(f.getPath());
           f.renameTo(new File("D:\\writedata.txt"));
          System.out.println(f.isFile());
           
	}

}
