package com.lab3.q3_7;

import java.util.Scanner;

public class Register {

	public boolean validate(String str)
	{
		if((str.length()>=12) && (str.charAt(str.length()-4)=='_') && (str.charAt(str.length()-3)=='j')&& (str.charAt(str.length()-2)=='o')&& (str.charAt(str.length()-1)=='b'))
			return true;
		else
			return false;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Register r = new Register();
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		sc.close();
		String str = st+"_job";
		System.out.println(r.validate(str));
	}

}
