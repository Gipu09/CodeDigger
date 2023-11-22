package com.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DynamicSaveUser {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo_jdbc","root","root");
			PreparedStatement pst=con.prepareStatement("insert into user_1(id,name,age,email,password,mobile) values(?,?,?,?,?,?)");
			Scanner sc = new Scanner(System.in);
			boolean flag=true;
			while (flag) {
				
			
			System.out.println("enter id: ");
			int id =sc.nextInt();
			
			System.out.println("enter name: ");
			String name = sc.next();
			
			System.out.println("enter age: ");
			int age= sc.nextInt();
			
			System.out.println("enter email: ");
			String email=sc.next();
			
			System.out.println("enter password: ");
			String pwd=sc.next();
			
			System.out.println("enter mobile: ");
			int mobile=sc.nextInt();
			
			pst.setInt(1, id);
			pst.setString(2, name);
			pst.setInt(3,age);
			pst.setString(4, email);
			pst.setString(5, pwd);
			pst.setInt(6, mobile);
			
			pst.executeUpdate();
			System.out.println("enter 1 to continue & any other number to exit");
			int exit=sc.nextInt();
			if (exit!=1) {
				break;
				
			}
			}
			
			con.close();
			System.out.println("data inserted");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
