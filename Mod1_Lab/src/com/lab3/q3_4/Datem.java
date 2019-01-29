package com.lab3.q3_4;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Datem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		System.out.println("dd/mm/yyyy:");
		String input1 = sc.nextLine();
		System.out.println("dd/mm/yyyy:");
		String input2 = sc.nextLine();
		sc.close();
		LocalDate inputDate1 = LocalDate.parse(input1, formatter);
		LocalDate inputDate2 = LocalDate.parse(input2, formatter);
		Period period = inputDate1.until(inputDate2);
		System.out.println("Days:"+period.getDays()+"\nMonth:"+period.getMonths()+"\nYear:"+period.getYears());
	}

}
