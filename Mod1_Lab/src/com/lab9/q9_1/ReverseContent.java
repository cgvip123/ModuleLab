package com.lab9.q9_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReverseContent {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("C:\\Users\\RSHAR126\\Desktop\\core java\\input.txt",true);
		BufferedWriter bw = new BufferedWriter(fw);
		FileReader fr = new FileReader("C:\\Users\\RSHAR126\\Desktop\\core java\\input.txt");
		BufferedReader br = new BufferedReader(fr);
		String s;
		String str1 = null;
		StringBuilder sb;	
		while((s=br.readLine())!=null)
		{
			String st[] = s.split(" ");
			for(String a:st)
			{
			sb = new StringBuilder(a);
			sb = sb.reverse();
			str1 = sb.toString()+" "+"\n";
			bw.write(str1);
			}
		}
		br.close();
		bw.close();
	}

}
