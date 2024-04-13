package com.jdbc.examples;
import java.sql.*;

public class Example1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		 try {
		 Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost/college","root","Sahithi@564");
			Statement st=c.createStatement();
			ResultSet rs=st.executeQuery("select * from student");
			System.out.println("display all the data");
			while(rs.next()) {
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
			st.close();
			rs.close();
	}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	}
