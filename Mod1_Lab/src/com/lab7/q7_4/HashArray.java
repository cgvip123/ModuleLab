package com.lab7.q7_4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashArray {

	public Map getSquares(int[] a)
	{
		Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
		
		for(int i:a)
		{
			hm.put(i, i*i);
		}
		return hm;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		HashArray ha = new HashArray();
		Map<Integer,Integer> hm1 =  ha.getSquares(a);
		Set s = hm1.entrySet();
		Iterator it = s.iterator();
		while(it.hasNext())
		{
			Map.Entry me = (Entry) it.next();
			System.out.println(me.getKey()+":"+me.getValue());
		}
		
	}

}
