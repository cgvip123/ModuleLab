package com.lab3.q3_2;

import java.util.Scanner;

public class StringOp {

	public String check(String str)
	{
		char[] b = str.toCharArray();
		for(int i=1;i<b.length;i++)
		{
			if(b[i]<b[i-1])
			{
				return "not";
			}
		}
		return "positive";
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		StringOp op = new StringOp();
		System.out.println(op.check(str));
	}

}
