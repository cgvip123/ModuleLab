package com.lab3.q3_8;

import java.util.Arrays;

public class ObjString {

		public String[] stringG(String[] str)
		{
			Arrays.sort(str);
			for(int i=0;i<str.length;i++)
			{
				if(str.length%2==0)
				{
					for(int i1 = 0;i1<str[i].length()/2;i1++)
					{
						str[i1] = str[i1].toUpperCase();
					}
					for(int i2 = str[i].length();i2<str[i].length()/2;i2--)
					{
						str[i2] = str[i2].toLowerCase();
					}
				}
				else
				{
					for(int i1 = 0;i1<str[i].length()/2;i1++)
					{
						str[i1] = str[i1].toUpperCase();
					}
					for(int i2 = str[i].length();i2<str[i].length()/2+1;i2--)
					{
						str[i2] = str[i2].toLowerCase();
					}
				}
			}
			return str;
		}
		public static void main(String[] args) {
			String[] str = {"hello","welcome","howdy","camel"};
			ObjString obs = new ObjString();
			String[] str2 = obs.stringG(str);
			for(String str3:str2)
			{
				System.out.println(str3);
			}
		}
}
