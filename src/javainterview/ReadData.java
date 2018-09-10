package javainterview;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadData {

	public static void main(String[] args) throws Exception{
        FileReader f=new FileReader("D:\\write.txt");
        BufferedReader br=new BufferedReader(f);
        String line="";
        while((line=br.readLine())!=null) {
        	//line=br.readLine();
        	System.out.println(line);
        	
        }
        br.close();
	}

}
