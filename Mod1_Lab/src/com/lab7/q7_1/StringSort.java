package com.lab7.q7_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class StringSort {

		public int[] getSort(int[] arr)
		{
			String str[] = new String[arr.length];
			ArrayList<String> al = new ArrayList<String>();
			String st ="";
			for(int i =0;i<arr.length;i++)
			{
				str[i] = Integer.toString(arr[i]);
				StringBuilder sb = new StringBuilder(str[i]);
				sb.reverse();
				st = sb.toString();
				al.add(st);
			}
			Collections.sort(al);
			String[] c = al.toArray(new String[0]);
			for(int i =0;i<c.length;i++)
			{
				arr[i] = Integer.parseInt(c[i]);
			}
			return arr;
		}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int[] arr = new int[sc.nextInt()];
			for(int i=0;i<arr.length;i++)
			{
				arr[i] = sc.nextInt();
			}
			sc.close();
			StringSort so = new StringSort();
			int cc[] = so.getSort(arr);
			for(int n:cc)
			{
				System.out.println(n);
			}
		}
}
