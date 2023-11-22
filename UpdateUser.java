package com.org.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateUser {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo_jdbc","root","root");
			
			Statement st = con.createStatement();
			
			st.execute("update user set age=22 where name='macq'");
			con.close();
			System.out.println("Data Updated");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
