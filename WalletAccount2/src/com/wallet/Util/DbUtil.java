package com.wallet.Util;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DbUtil {

	private static String url = null;
	private static String userName = null;
	private static String pwd = null;
	static Connection con = null;
	static Statement st = null;

	public static Connection getCon()  {
		Properties props;
		props = getProps();
		url = props.getProperty("dburl");
		userName = props.getProperty("dbusr");
		pwd = props.getProperty("dbpwd");
		if (con == null) {
			try {
				con = DriverManager.getConnection(url, userName, pwd);
				st = con.createStatement();
//				createTable();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return con;
	}

	/*public static void createTable()
	{
		String customerTable = "create table customer (phone varchar2(10) not null primary key, name varchar2(30))";
		String walletTable = "create table wallet (phone varchar2(10) not null primary key, balance number(10))";
		String TransactionTable = "create table transaction (sender_phone varchar2(10),reciever_phone varchar2(10),amount number(10),type varchar2(20))";
		 try {
			st.executeUpdate(customerTable);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 try {
			st.executeUpdate(walletTable);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 try {
			st.executeUpdate(TransactionTable);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}*/
	public static Properties getProps()  {
		Properties dbProps = new Properties();
		FileReader fr;
		try {
			fr = new FileReader("dbinfo.properties");
			dbProps.load(fr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dbProps;
	}
}
