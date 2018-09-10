package com.webdriver;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args) throws IOException {
        BufferedWriter br=new BufferedWriter(new FileWriter("C:\\Users\\PC\\Desktop\\intoduction.txt"));
        br.write("ashok1,");
        br.write("reddy");
        br.newLine();
        br.write("singareddy");
        br.newLine();   
        br.append("asjk");
        br.flush();
        br.close();
	}

}
