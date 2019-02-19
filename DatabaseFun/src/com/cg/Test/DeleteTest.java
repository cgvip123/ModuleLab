package com.cg.Test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.cg.Util.DbUtil;

public class DeleteTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter EmpID:");
		int eid =sc.nextInt();
		
		try {
			Connection con = DbUtil.getCon();
			String insertQry = "DELETE FROM emp1 where emp_id = ?";
			PreparedStatement pst = con.prepareStatement(insertQry);
			pst.setInt(1, eid);
			int data = pst.executeUpdate();
			System.out.println("Delete successfully:"+data);
		}
		catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
