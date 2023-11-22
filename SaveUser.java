package com.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class SaveUser {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/demo_jdbc","root","root");
			PreparedStatement pst =con.prepareStatement("insert into user_1(id,name,age,email,password,mobile) values(?,?,?,?,?,?)");
			pst.setInt(1, 101);
			pst.setString(2, "gipu");
			pst.setInt(3,21);
			pst.setString(4, "gipu@gmail.com");
			pst.setString(5, "@1234");
			pst.setString(6, "891736");
			
			pst.executeUpdate();
			
			con.close();
			System.out.println("data inserted");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
