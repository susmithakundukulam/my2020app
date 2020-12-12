package com.my2020app.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {
	public static void main(String args[]) {
		
		String jdbcURL="jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false&serverTimezone=UTC";
		String user ="hbstudent";
		String pass ="hbstudent";
		try {
			System.out.println("connecting to database...");
			Connection myConn = DriverManager.getConnection(jdbcURL, user, pass);
			System.out.println("connection successful!!....");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
