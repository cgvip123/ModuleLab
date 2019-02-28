package com.cg.hr.util;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtil {

	private Connection con;
	
	public DBUtil() {
		// TODO Auto-generated constructor stub
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String pass = "Capgemini123";
			con = DriverManager.getConnection(url, user, pass);
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
	public Connection getConnect()
	{
		return con;
	}
}
