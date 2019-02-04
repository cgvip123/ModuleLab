package com.lab7_6.cg.eis.pl;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.lab7_6.cg.eis.bean.Employee;
import com.lab7_6.cg.eis.service.EmployeeServiceImpl;

public class EmployeeMain {

	public static int id = 11;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeServiceImpl empl = new EmployeeServiceImpl();
		Scanner scan = new Scanner(System.in);
		List<Employee> al = new ArrayList<>();
		char flag = 'T';
		while(flag == 'T')
		{
			System.out.println("Menu:");
			System.out.println("1:add employee:");
			System.out.println("2.Enter insurSchme to check:");
			System.out.println("3.Delete employee by id:");
			System.out.println("4.display:");
			System.out.println("5.Sort by salary:");
			System.out.println("0.Exit:");
			int ch = scan.nextInt();
			switch(ch) {
			case 1: System.out.println("Enter the no. of employee:");
					int limit = scan.nextInt();
					for(int i =0 ;i<limit;i++)
					{
						System.out.println("Emloyee name:");
						String name = scan.next();
						System.out.println("Emloyee salary:");
						double salary = scan.nextDouble();
						System.out.println("Emloyee designation:");
						String designation = scan.next();
						System.out.println("Emloyee scheme:");
						String insurScheme = scan.next();
						al.add(new Employee(name,salary,designation,insurScheme));
						System.out.println(empl.addEmployee(id,al));
					}
					break;
			case 2: System.out.println("Enter insureScheme:");
					String ins = scan.next();
					empl.displayIns(ins);
					break;
			case 3: System.out.println("Enter the id for delete the employee:");
					int id1 = scan.nextInt();
					System.out.println(empl.delEmployee(id1));
					break;
			case 4: empl.display();
					break;
			case 5: empl.sortBySal();
					break;
			case 0: flag = 'F';
					break;
			default: System.out.println("wrong choice input:");
					 break;
			}
		}
	}
}
