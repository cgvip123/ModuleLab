package com.cg.Test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.cg.Util.DbUtil;

public class TransactionDemo {

	public static void main(String[] args) {
		Connection con = null;
		try {
			con = DbUtil.getCon();
			String update = "Update emp1 set emp_name = 'Rahul' where emp_id = 444";
			String update1 = "Update emp1 set emp_name = 'Sonu' where emp_id = 123";
			Statement st = con.createStatement();
			st.addBatch(update);
			st.addBatch(update1);
			int data[] =  st.executeBatch();
			con.commit();
			System.out.println("update success");
		} catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	}
}
