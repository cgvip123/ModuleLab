package com.lab3.q3_3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;

public class Dat {

	public LocalDate displayDate()
	{
		LocalDate curr = LocalDate.now();
		return curr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dat d = new Dat();
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Year:");
		int year = sc.nextInt();
		System.out.println("month:");
		int month = sc.nextInt();
		System.out.println("dayofMonth:");
		int dayofMonth = sc.nextInt();*/
		System.out.println("Current Date:"+d.displayDate().format(formatter));
	}

}
