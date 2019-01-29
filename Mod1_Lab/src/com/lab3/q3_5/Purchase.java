package com.lab3.q3_5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Purchase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		System.out.println("dd/mm/yyyy:");
		String input1 = sc.nextLine();
		System.out.println("Month and year:");
		int input2 = sc.nextInt();
		int input3 = sc.nextInt();
		sc.close();
		LocalDate inputDate1 = LocalDate.parse(input1, formatter);
		System.out.println("Day:"+inputDate1.plusMonths(input2).plusYears(input3));
	}

}
