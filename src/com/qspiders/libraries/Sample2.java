package com.qspiders.libraries;
import java.io.*;
public class Sample2 {

	public static void main(String[] args) throws IOException  {
		File f = new File("abc.txt");
		System.out.println(f.exists());
		f.mkdir();
		System.out.println(f.exists());

	}

}
