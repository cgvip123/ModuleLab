package com.lab9.q9_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EvenShow {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File("C:\\Users\\RSHAR126\\Desktop\\core java\\numbers.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String str;
		while(scanner.hasNext())
		{
			str = scanner.nextLine();
			String[] st = str.split(",");
			for(String s:st)
			{
				int num = Integer.parseInt(s);
				if(num%2==0)
				{
					System.out.print(num+" ");
				}
			}
		}
	}

}
