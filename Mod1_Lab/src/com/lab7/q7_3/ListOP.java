package com.lab7.q7_3;

import java.util.ArrayList;
import java.util.List;

public class ListOP {
	public List<String> removElements(List<String> l,List<String> l2)
	{
		l.removeAll(l2);
		return l;
		
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l = new ArrayList<String>();
		l.add("rahul");
		l.add("sunil");
		l.add("satyapal");
		l.add("shubham");
		l.add("brajesh");
		
		List<String> l2 = new ArrayList<String>();
		l2.add("rahul");
		l2.add("brajesh");
		
		ListOP lo = new ListOP();
		 List<String> l3 =  lo.removElements(l, l2);
		 for(String str:l3)
		 {
			 System.out.println(str);
		 }
	}

}
