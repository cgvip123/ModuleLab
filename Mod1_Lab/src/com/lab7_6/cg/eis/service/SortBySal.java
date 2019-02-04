package com.lab7_6.cg.eis.service;

import java.util.Comparator;

import com.lab7_6.cg.eis.bean.Employee;

public class SortBySal implements Comparator<Employee> {
	
	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return (int) (e1.getSalary() - e2.getSalary());
	}

}
