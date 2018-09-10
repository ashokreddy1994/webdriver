package com.webdriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization implements Serializable {
	int i=10;
	int b=20;

	public static void main(String[] args) throws Exception {
		Serialization s=new Serialization();
		File f=new File("D:\\abc.txt");
		FileOutputStream fos=new FileOutputStream(f);
		ObjectOutputStream fout=new ObjectOutputStream(fos);
		fout.writeObject(s);
		FileInputStream fis=new FileInputStream(f);
		ObjectInputStream fin= new ObjectInputStream(fis);
		Serialization s1=(Serialization)fin.readObject();
		System.out.println(s1.i+" "+s1.b);
              
	}

}
