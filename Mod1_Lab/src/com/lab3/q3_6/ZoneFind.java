package com.lab3.q3_6;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class ZoneFind {

		public ZonedDateTime Zoney(String str)
		{
			ZonedDateTime currentTime = ZonedDateTime.now(ZoneId.of(str));
			return currentTime;
		}
		public static void main(String args[])
		{
			ZoneFind zf = new ZoneFind();
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
			sc.close();
			System.out.println(zf.Zoney(str));
		}
}
