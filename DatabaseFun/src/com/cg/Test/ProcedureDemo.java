package com.cg.Test;

import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import com.cg.Util.DbUtil;

public class ProcedureDemo {

	public static void main(String[] args) {
		try {
			Connection con = DbUtil.getCon();
			CallableStatement cst = con.prepareCall("call pr1(?,?)");
			cst.setInt(1, 111);
			cst.registerOutParameter(2, Types.NUMERIC);
			ResultSet rs = cst.executeQuery();
			System.out.println("Salary is:"+ cst.getInt(2));
			System.out.println("---------------");
			boolean bb = cst.execute();
			System.out.println("Salary is:"+ cst.getInt(2));
		} catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
