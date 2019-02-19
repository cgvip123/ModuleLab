package com.cg.Test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.cg.Util.DbUtil;

public class InsertTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter EmpID:");
		int eid =sc.nextInt();
		System.out.println("Enter empName:");
		sc.nextLine();
		String enm =sc.nextLine();
		System.out.println("Enter the Salary:");
		float esal = sc.nextFloat();
		
		try {
			Connection con = DbUtil.getCon();
			String insertQry = "INSERT INTO emp1 "+
							   "(emp_id,emp_name,emp_sal) "+
							   "VALUES(?,?,?)";
			PreparedStatement pst = con.prepareStatement(insertQry);
			pst.setInt(1, eid);
			pst.setString(2, enm);
			pst.setFloat(3, esal);
			int data =  pst.executeUpdate();
			System.out.println("Data is inserted:"+data);
		} catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
