package com.lab7.q7_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> product = new ArrayList<>();
		product.add("rahul");
		product.add("sunil");
		product.add("satyapal");
		product.add("shubham");
		product.add("brajesh");
		
		Set<String> s = new TreeSet<>();
		
		for(String str:product)
		{
			s.add(str);
		}
		for(String str:s)
		{
			System.out.println(str);
		}
	}

}
