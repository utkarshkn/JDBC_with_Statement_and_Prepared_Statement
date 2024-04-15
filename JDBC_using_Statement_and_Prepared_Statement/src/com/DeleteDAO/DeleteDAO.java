package com.DeleteDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class DeleteDAO {

	public void DeleteSD() throws Exception{

		// Load Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded Succesfully");
		// Connect the My SQL to the Eclipse
		Connection cn = DriverManager.getConnection("jdbc:Mysql://localhost:3306/info", "root", "Utkadkar@123");
		System.out.println("Connected Succesfully");
		// Statement Interface
		Statement st = cn.createStatement();
		// Insert Query
		st.executeUpdate("delete from student where id = 101");
		System.out.println("Deleted Succesfully");
	}

	public void DeletePSD() throws Exception {
		// Load Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded Succesfully");
		// Connect the My SQL to the Eclipse
		Connection cn = DriverManager.getConnection("jdbc:Mysql://localhost:3306/info", "root", "Utkadkar@123");
		System.out.println("Connected Succesfully");
		// Statement Interface
		PreparedStatement ps = cn.prepareStatement("delete from student where id = ?");
		ps.setInt(1, 4);
		ps.executeUpdate();
		System.out.println("Deleted Succesfully");
	}

	public void DeletePSP(String name) throws Exception {
		// Load Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded Succesfully");
		// Connect the My SQL to the Eclipse
		Connection cn = DriverManager.getConnection("jdbc:Mysql://localhost:3306/info", "root", "Utkadkar@123");
		System.out.println("Connected Succesfully");
		// Statement Interface
		PreparedStatement ps = cn.prepareStatement("delete from student where id = ?");
		ps.setInt(1, 66);
		ps.executeUpdate();
		System.out.println("Deleted Succesfully");
	}
}
