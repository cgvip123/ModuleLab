package com.lab7_6.cg.eis.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.lab7_6.cg.eis.bean.Employee;

public class EmployeeServiceImpl {
	SortBySal s = new SortBySal();
	Map<Integer,Employee> list = new HashMap<Integer,Employee>();
	public List<Employee> al = new ArrayList<Employee>();
	public String addEmployee(int id, List<Employee> al)
	{
		for(Employee o:al)
		{
			list.put(id,o);
			id++;
		}
		return "User entered succefully";
	}
	public void displayIns(String ins)
	{
		for(Entry<Integer,Employee> i:list.entrySet())
		{
			if(i.getValue().getInsurScheme().equals(ins))
			{
				System.out.println("Id:"+i.getKey());
				System.out.println("Name:"+i.getValue().getName());
				System.out.println("Salary:"+i.getValue().getSalary());
				System.out.println("Designation:"+i.getValue().getDesignation());
				System.out.println("Insure Scheme:"+i.getValue().getInsurScheme());
			}
		}
		System.out.print("wrong input entered");
	}
	public boolean delEmployee(int id1)
	{
		sortBySal();
		for(Entry<Integer,Employee> i:list.entrySet())
		{
			if(id1==i.getKey())
			{
				list.remove(id1);
				return true;
			}
		}
	return false;	
	}
	public void display()
	{
		for(Entry<Integer,Employee> i:list.entrySet())
		{
			System.out.println("Id:"+i.getKey());
			System.out.println("Name:"+i.getValue().getName());
			System.out.println("Salary:"+i.getValue().getSalary());
			System.out.println("Designation:"+i.getValue().getDesignation());
			System.out.println("Insure Scheme:"+i.getValue().getInsurScheme());
		}
	}
	public void sortBySal()
	{
		for(Entry<Integer,Employee> i:list.entrySet())
		{
			al.add(i.getValue());
		}
		Collections.sort(al, s);
		System.out.println(al);
	}
}
