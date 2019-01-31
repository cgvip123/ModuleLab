package com.lab6.q6_1;

public class EmployeeMain {

	static void check(Employee e) throws InputblankException
	{
		if(e.getFirstName()=="" && e.getLastName() == "")
		{
			throw new InputblankException("Input first and last name");
		}
		else
		{
			System.out.println("FirstName:"+e.getFirstName()+"\n"+"lastName:"+e.getLastName()+"\n"+
								"Gender:"+e.getGender());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee("","",'F');
		try
		{
			check(e);
		}
		catch(Exception ex)
		{
			System.out.println("Exception occur:"+ex);
		}
	}

}
