package com.labactivity;

import java.sql.*;

public class CrudOperations {

	public static void main(String[] args) throws Exception {
		String url="jdbc:mysql://localhost/organization";
		String userName="root";
		String password="Sahithi@564";
		String INSERT_QUERY="insert into employe values(6,'sahithi',25)";
		String UPDATE_QUERY="update employe set emp_age=45 where emp_id=1";
		String DELETE_QUERY="delete from employe where emp_id=3";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//loading driver
			Connection con=DriverManager.getConnection(url, userName, password);//register driver
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("Select * from employe");
			System.out.println("Displays all the data");//display the table in database
			while(rs.next()) {
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
			int rowsInserted=st.executeUpdate(INSERT_QUERY);//insert data into table
			System.out.println("Number of rows affected is: "+rowsInserted);
			int rowsUpdated=st.executeUpdate(UPDATE_QUERY);//update the query
			System.out.println("Number of rows affected is: "+rowsUpdated);
			int rowsDeleted=st.executeUpdate(DELETE_QUERY);//delete the query
			System.out.println("Number of rows affected is: "+rowsDeleted);
			st.close();
			rs.close();
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
