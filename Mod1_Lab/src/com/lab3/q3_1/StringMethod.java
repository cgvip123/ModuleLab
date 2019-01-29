package com.lab3.q3_1;

public class StringMethod {
	
		public String addi(String str)
		{
			return str+str;
		}
		public String replac(String str)
		{
			char[] arr = str.toCharArray();
			String w = "";
			for(int i = 0;i<arr.length;i++)
			{
				if(i%2!=0)
				{
					w = w+arr[i];
				}
				else
				{
					w = w + "#";
				}
			}
			return w;
		}
		public String remov(String str)
		{
			String wrd = "";
			for(int i= 0;i<str.length();i++)
			{
				if(str.contains(String.valueOf(str.charAt(i))))
				{
					wrd = wrd + String.valueOf(str.charAt(i));
				}
			}
			return wrd;
		}
		public String uppr(String str)
		{
			char[] a = str.toCharArray();
			String wr = "";
			for(int i =0;i<a.length;i++)
			{
				if(i%2!=0)
				{
					wr = wr + a[i];
				}
				else
				{
					wr = wr + Character.toUpperCase(a[i]);
				}
			}
			return wr;
		}
}
