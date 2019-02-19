package com.cg.ui;

import java.util.ArrayList;
import java.util.Scanner;

import com.cg.dto.Employee;
import com.cg.service.EmployeeService;
import com.cg.service.IEmployeeService;

public class UI {

	 static IEmployeeService empSer = new EmployeeService();
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//insertion
		//searching
		//Fetch all record
		
		while(true)
		{
			menu();
		}
	}

	private static void menu() {
		// TODO Auto-generated method stub
		System.out.println("JPA Hibernate Running Menu");
		System.out.println("1.Insert");
		System.out.println("2.Search");
		System.out.println("3.fetch");
		System.out.println("4.delete");
		System.out.println("5.update");
		System.out.println("6.exit");
		int ch = sc.nextInt();
		sc.nextLine();
		switch(ch)
		{
		case 1: insert();
				break;
		case 2: search();
				break;
		case 3: fetch();
		 		break;
		case 4: delet();
				break;
		case 5: updat();
				break;
		case 6: System.exit(0);		
		}
	}

	private static void updat() {
		// TODO Auto-generated method stub
		System.out.println("Enter the id");
		int id = sc.nextInt();
		System.out.println("enter the new name");
		String name = sc.next();
		System.out.println("enter the salary");
		float sal = sc.nextFloat();
		Employee upd = empSer.updateEmp(id, name, sal);
		System.out.println(upd + ":updated");
	}

	private static void delet() {
		// TODO Auto-generated method stub
		System.out.println("------Delete------");
		System.out.println("enter the id to delete");
		int id = sc.nextInt();
		Employee del =  empSer.deleteEmp(id);
		System.out.println(del+ ":deleted");
		
	}

	private static void fetch() {
		// TODO Auto-generated method stub
		System.out.println("---------Fetch record---------");
		ArrayList<Employee> alist = empSer.fetchAllEmp();
		for(Employee e:alist)
		{
			System.out.println(e.getEmpid()+"\t"+e.getEmpName()+"\t"+e.getEmpSal());
		}
		
	}

	private static void search() {
		// TODO Auto-generated method stub
		System.out.println("enter the to search");
		int id =sc.nextInt();
		Employee ee1 =  empSer.getEmpByEid(id);
		System.out.println(ee1);
		
	}

	private static void insert() {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		System.out.println("enter the name");
		String name = sc.nextLine();
		e1.setEmpName(name);
		System.out.println("enter the salary");
		float sal = sc.nextFloat();
		e1.setEmpSal(sal);
		Employee ee = empSer.addEmp(e1);
		System.out.println(ee   + "are inserted in the table");
		
	}
}
