package com.webdriver;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read {

	public static void main(String[] args) throws IOException {
		BufferedReader br=null;
              try {
				 br=new BufferedReader(new FileReader("C:\\Users\\PC\\Desktop\\intoduction.txt"));
				String line;
				while((line=br.readLine())!=null)
				{
					System.out.println(line);
				}
				
			}
              catch (FileNotFoundException e)
              {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
              finally
              {
            	  br.close();
              }
	}

}
