package com.cg.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC {

	public static void main(String[] args) {
		Connection con = null;
		Statement stat = null;
		ResultSet rs = null;
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "Capgemini123");
		stat = con.createStatement();
		rs = stat.executeQuery("select * from emp1");
		System.out.println("ID\t\t Name\t\t Salary\t\t DOJ");
		while(rs.next())
		{
			System.out.println(rs.getInt("emp_id")+"\t\t"+rs.getString("emp_name")+"\t"+rs.getInt("emp_sal")+"\t\t"+rs.getDate("emp_dob"));
		}
		rs.close();
		stat.close();
		con.close();
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
