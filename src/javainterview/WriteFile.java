package javainterview;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteFile {

	public static void main(String[] args) throws Throwable {
              FileWriter f=new FileWriter("D:\\write.txt");
              BufferedWriter br=new BufferedWriter(f);
              br.write("ashok reddy");
              br.newLine();
              br.write("singareddy");
              br.flush();
              br.close();
	}

}
