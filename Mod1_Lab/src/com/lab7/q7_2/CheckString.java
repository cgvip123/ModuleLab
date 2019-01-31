package com.lab7.q7_2;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckString {

		public ArrayList stringOP(String S1,String S2,String ch)
		{
			ArrayList<String> str = new ArrayList<String>();
			if(ch.equalsIgnoreCase("1"))
			{
				String S3 = "";
				for(int i=0;i<S1.length();i++)
				{
					if(i%2!=0)
					{
						S3 = S3 + S1.charAt(i);
					}
					else
					{
						S3 = S3+S2;
					}
				}
				System.out.println(S3);
			}
			return str;
			
		}
		public static void main(String[] args) {
			CheckString cs = new CheckString();
			Scanner sc = new Scanner(System.in);
			String S1 = sc.nextLine();
			String S2 = sc.nextLine();
			System.out.println("Menu:");
			System.out.println("1.Add Alternate:");
			System.out.println("2.Replace:");
			System.out.println("3.Delete:");
			System.out.println("4.Divide:");
			System.out.println("5.Change:");
			String ch = sc.nextLine();
			cs.stringOP(S1, S2, ch);
			
			
		}
}

