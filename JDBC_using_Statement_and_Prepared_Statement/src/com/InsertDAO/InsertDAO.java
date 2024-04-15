package com.InsertDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class InsertDAO {

	public void InsertSD() throws Exception {

		// Load Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded Succesfully");
		// Connect the My SQL to the Eclipse
		Connection cn = DriverManager.getConnection("jdbc:Mysql://localhost:3306/info", "root", "Utkadkar@123");
		System.out.println("Connected Succesfully");
		// Statement Interface
		Statement st = cn.createStatement();
		// Insert Query
		st.executeUpdate("insert into student values(57, 'HHH')");
		System.out.println("Inserted Succesfully");
	}

	public void InsertPSD() throws Exception {
		// Load Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded Succesfully");
		// Connect the My SQL to the Eclipse
		Connection cn = DriverManager.getConnection("jdbc:Mysql://localhost:3306/info", "root", "Utkadkar@123");
		System.out.println("Connected Succesfully");
		// Statement Interface
		PreparedStatement ps = cn.prepareStatement("insert into student values(?,?)");
		ps.setInt(1, 60);
		ps.setString(2, "rohit");
		ps.executeUpdate();
		System.out.println("Inserted Succesfully");
	}
	
	public void InsertPSP(int id, String name) throws Exception {
		// Load Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded Succesfully");
		// Connect the My SQL to the Eclipse
		Connection cn = DriverManager.getConnection("jdbc:Mysql://localhost:3306/info", "root", "Utkadkar@123");
		System.out.println("Connected Succesfully");
		// Statement Interface
		PreparedStatement ps = cn.prepareStatement("insert into student values(?,?)");
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.executeUpdate();
		System.out.println("Inserted Succesfully");
	}
}
