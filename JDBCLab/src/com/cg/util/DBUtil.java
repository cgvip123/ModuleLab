package com.cg.util;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtil {

	private static String url = null;
	private static String userName = null;
	private static String pwd = null;
	private static String driver = null;
	static Connection con = null;

	public static Connection getCon() throws SQLException, IOException {
		Properties props = getProps();
		url = props.getProperty("dburl");
		userName = props.getProperty("dbusr");
		pwd = props.getProperty("dbpwd");
		if (con == null) {
			con = DriverManager.getConnection(url, userName, pwd);
		}
		return con;
	}

	public static Properties getProps() throws IOException {
		Properties dbProps = new Properties();
		FileReader fr = new FileReader("DBinfo.properties");
		dbProps.load(fr);
		return dbProps;
	}
}
