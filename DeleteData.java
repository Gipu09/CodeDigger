package com.org.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteData {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo_jdbc","root","root");
			
			Statement st = connection.createStatement();
			
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter an id: ");
			int id = sc.nextInt();
			
			st.execute("delete from user where id="+id);
			
			connection.close();
			System.out.println("Data deleted");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
