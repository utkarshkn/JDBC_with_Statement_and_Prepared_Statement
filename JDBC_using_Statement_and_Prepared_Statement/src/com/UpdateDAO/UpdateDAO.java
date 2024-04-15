package com.UpdateDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class UpdateDAO {

	public void UpdateSD() throws Exception{

		// Load Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded Succesfully");
		// Connect the My SQL to the Eclipse
		Connection cn = DriverManager.getConnection("jdbc:Mysql://localhost:3306/info", "root", "Utkadkar@123");
		System.out.println("Connected Succesfully");
		// Statement Interface
		Statement st = cn.createStatement();
		// Insert Query
		st.executeUpdate("update student set name = 'Isha' where id = 4");
		System.out.println("Updated Succesfully");
	}

	public void UpdatePSD() throws Exception {
		// Load Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded Succesfully");
		// Connect the My SQL to the Eclipse
		Connection cn = DriverManager.getConnection("jdbc:Mysql://localhost:3306/info", "root", "Utkadkar@123");
		System.out.println("Connected Succesfully");
		// Statement Interface
		PreparedStatement ps = cn.prepareStatement("update student set name = ? where id = ?");
		ps.setInt(2, 66);
		ps.setString(1, "Raja");
		ps.executeUpdate();
		System.out.println("Updated Succesfully");
	}

	public void UpdatePSP(int id, String name) throws Exception {
		// Load Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded Succesfully");
		// Connect the My SQL to the Eclipse
		Connection cn = DriverManager.getConnection("jdbc:Mysql://localhost:3306/info", "root", "Utkadkar@123");
		System.out.println("Connected Succesfully");
		// Statement Interface
		PreparedStatement ps = cn.prepareStatement("update student set name = ? where id = ?");
		ps.setString(1, name);
		ps.setInt(2, id);
		ps.executeUpdate();
		System.out.println("Inserted Succesfully");
	}
}
