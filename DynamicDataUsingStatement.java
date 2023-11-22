package com.org.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class DynamicDataUsingStatement { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			// load & register

			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//establish the connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo_jdbc","root","root");
			
			//create platform or statement
			Statement statement = connection.createStatement();
			
			System.out.println("Enter id: ");
			int id = sc.nextInt();
			
			System.out.println("Enter Name: ");
			String name = sc.next();
			
			System.out.println("Enter age: ");
			int age = sc.nextInt();
			
			System.out.println("Enter mobile: ");
			int mobile = sc.nextInt();
			
			String sql ="insert into user(id,name,age,mobile) values("+id+",'"+name+"',"+age+",'"+mobile+"')";
			//execute query
			statement.execute(sql);
			
			//close connection
			connection.close();
			
			System.out.println("Data saved");
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
