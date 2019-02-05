package com.cg.eis.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.cg.eis.bean.MobileDetails;

public class MobileService {

	List<MobileDetails> mobD = new ArrayList<>();
	
	public MobileService()
	{
		addMobDetails();
	}
	
	Random rand = new Random();
	public void addMobDetails()
	{
		String[] mob = {"Nokia","Sony","Honor","One Plus","Samsung","Xiomi"};
		int id = rand.nextInt(9999)+1000;
		double[] mobPrice = {12000,15000,13000,25000,19000,10000};
		int [] mobStock = {5,4,7,2,6,8};
		for(int i =0;i<6;i++)
		{
			mobD.add(new MobileDetails(id, mob[i], mobPrice[i], mobStock[i]));
		}
	}
	
	public void delByMobileId(int id)
	{
		for(int i =0;i<mobD.size();i++)
		{
			if(mobD.get(i).getMobileId()==id)
			{
				int j = mobD.get(i).getStock();
				mobD.get(i).setStock(j-1);
			}
		}
	}
	
	public void showMobInRange(int min,int max)
	{
		ArrayList<String> mob = new ArrayList<>();
		ArrayList<Double> mobPrice = new ArrayList<>();
		ArrayList<Integer> mobStock = new ArrayList<>();
		int f=0;
		for(int i =0 ;i<mobD.size();i++)
		{
			if(mobD.get(i).getMobilePrice()>=min && mobD.get(i).getMobilePrice()<=max)
			{
				mob.add(mobD.get(i).getMobileName());
				mobPrice.add(mobD.get(i).getMobilePrice());
				mobStock.add(mobD.get(i).getStock());
				f=1;
			}
		}
		if(f==1)
		{
			System.out.println("Mobile names:"+mob);
			System.out.println("Mobile prices:"+mobPrice);
			System.out.println("Mobile stocks:"+mobStock);
		}
		else
		{
			System.out.println("no mobiles exist in this range");
		}
	}
	public void mobAvailabilty()
	{
		for(MobileDetails m:mobD)
		{
			System.out.println("Mob name is:"+m.getMobileName()+"mobile price"+m.getMobilePrice()+"mobile stock:"+m.getStock());
		}
	}
	public List<MobileDetails> getMobileList()
	{
		return mobD;
	}
}
