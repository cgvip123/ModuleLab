package com.lab8.q8_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileProgam {

	public static void main(String[] args) throws FileNotFoundException {
		CopyDataThread cp = new CopyDataThread(new FileInputStream("C:\\Users\\RSHAR126\\Desktop\\core java\\input.txt"),new FileOutputStream("C:\\Users\\RSHAR126\\Desktop\\core java\\output.txt"));
		cp.start();
	}
}
