package com.lab9_3.cg.eis.service;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.lab9_3.cg.eis.bean.Employee;

public class Services implements EmployeeService {
		public Employee EmployeeDetails(int id, String name, double salary, String designation, char insurScheme) {
			Employee emp = new Employee(id,name,salary,designation,insurScheme);
			return emp;
		}
		public void insureScheme(double salary, String designation,Employee emp) {
			
			if((salary>5000 && salary<20000) && designation.equals("System Associate"))
			{
				emp.setInsurScheme('C');
			}
			else if((salary>=20000 && salary<40000) && designation.equals("Programmer"))
			{
				emp.setInsurScheme('B');
			}
			else if(salary>=40000 && designation.equals("Manager"))
			{
				emp.setInsurScheme('A');
			}
			else
			{
				emp.setInsurScheme('N');
			}
		}
		public void AllDetails(Employee emp) {
						System.out.println("id:"+emp.getId()+"\n"+"Name:"+emp.getName()+"\n"+"Salary:"+emp.getSalary()+"\n"+
											"Designation:"+emp.getDesignation()+"\n"+"InsuranceScheme:"+emp.getInsurScheme());
		}
		public void WriteReadFile(Employee emp)
		{
			try(FileOutputStream fo = new FileOutputStream("C:\\Users\\RSHAR126\\Desktop\\core java\\employee.txt");
					ObjectOutputStream oo = new ObjectOutputStream(fo);)
			{
				oo.writeObject(emp);
			} 
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try(FileInputStream fi =new FileInputStream("C:\\Users\\RSHAR126\\Desktop\\core java\\employee.txt");
					ObjectInputStream oi =new ObjectInputStream(fi);)
			{
				Employee emp2 = (Employee) oi.readObject();
				System.out.println(emp2);
			} 
				catch (IOException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
					
		}
		

}
