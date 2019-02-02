package com.lab7.q7_2;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckString {

		public ArrayList stringOP(String S1,String S2)
		{
			ArrayList<String> str = new ArrayList<String>();
			//7.2.1
			String S3 = "";
			for(int i=0;i<S1.length();i++)
			{
				char ch1 = S1.charAt(i);
				if(i%2==0)
				{
					S3+=ch1;
					}
				else
				{
					S3+=S2;
				}
						 
			}
				str.add(S3);
			//7.2.2
				String S4 = "";
				String S5 = "";
				if(S3.indexOf(S2)==S3.lastIndexOf(S2))
				{
					S3.concat(S2);
					System.out.println(S3);
				}
				else
				{
					for(int i =S2.length()-1;i>=0;i--)
					{
						S4 += S2.charAt(i);
					}
					 S5  =  S3.replace(S3.substring(S3.lastIndexOf(S2), S3.length()), S4);
					str.add(S5);
				}
				//7.2.3
				System.out.println(S3);
				System.out.println(S2);
				String S6 = "";
				if(S3.indexOf(S2)==S3.lastIndexOf(S2))
				{
					//System.out.println(S3);
				}
				else
				{
					S6 = S3.replaceFirst(S2, "");
				}
				str.add(S6);
				//7.2.4
				String S7 = "";
				if(S2.length()%2==0)
				{
					S7 = S2.substring(0, S2.length()/2)+S3+S2.substring(S2.length()/2, S2.length());
				}
				else
				{
					S7 = S2.substring(0, S2.length()/2+1)+S3+S2.substring(S2.length()/2+1, S2.length());
				}
				str.add(S7);
				//7.2.5
				String S8 = "";
				for(int i =0;i<S3.length();i++)
				{
					S8 = S3.replace(S2.charAt(i), '*');
				}
				System.out.println(S8);
				
			return str;
		}
		public static void main(String[] args) {
			CheckString cs = new CheckString();
			Scanner sc = new Scanner(System.in);
			String S1 = sc.nextLine();
			String S2 = sc.nextLine();
			cs.stringOP(S1, S2);
			
			
		}
}

