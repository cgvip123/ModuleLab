package com.lab3.q3_1;

import java.util.Scanner;
public class Sting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringMethod sm = new StringMethod();
		Scanner sc= new Scanner(System.in);
		System.out.println("string:");
		String str = sc.nextLine();
		System.out.println("1. Add String\n 2.Replace String\n 3.Remove Duplicates \n 4.Upper String");
		int ch= sc.nextInt();
		
		sc.close();
		switch(ch)
		{
		case 1: System.out.println(sm.addi(str));
				break;
		case 2: System.out.println(sm.replac(str));
				break;
		case 3: System.out.println(sm.remov(str));
				break;
		case 4: System.out.println(sm.uppr(str));
				break;
		}
		
	}

}
