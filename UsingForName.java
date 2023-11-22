package com.org.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UsingForName {
	public static void main(String[] args) {
		try {
		// load & register
			
			Class.forName("com.mysql.cj.jdbc.Driver");	
			
		//establish connection
			
		 Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo_jdbc","root","root");
		 
		//create statement
		 
		 Statement st = con.createStatement();
		 
		 //execute query
		 st.execute("insert into user(id,name,age,mobile) values(1,'gipu','21','8917365495')");
		 con.close();
		 System.out.println("load and register complete");
		 System.out.println("connection established");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
