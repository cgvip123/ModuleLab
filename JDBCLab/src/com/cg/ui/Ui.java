package com.cg.ui;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.cg.util.DBUtil;



public class Ui {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while(true)
		{
			menu();
		}
	}

	private static void menu() {
		// TODO Auto-generated method stub
		System.out.println("JDBC Operation");
		System.out.println("1.Display");
		System.out.println("2.remove");
		System.out.println("3.Exit");
		int ch = sc.nextInt();
		switch(ch)
		{
		case 1: display();
				break;
		case 2: remov();
				break;
		case 3: System.exit(0);
				break;
		}
	}

	private static void remov() {
		// TODO Auto-generated method stub
		try {
			Connection con = DBUtil.getCon();
			String insertQry = "DELETE FROM list1 where id in(select id from list2)";
			PreparedStatement pst = con.prepareStatement(insertQry);
			int data = pst.executeUpdate();
			System.out.println("Delete successfully:"+data);
		}
		catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	private static void display() {
		// TODO Auto-generated method stub
	try {
		Connection con = DBUtil.getCon();
		PreparedStatement pst = con.prepareStatement("select * from list1");
		ResultSet rs = pst.executeQuery();
		System.out.println("ID\t\t Name");
		while(rs.next())
		{
			System.out.println(rs.getInt("id")+"\t\t"+rs.getString("name"));
		}
	} catch (SQLException | IOException e) {
		// TODO Auto-generated catch block
		System.out.println(e);
	}
	}
}
