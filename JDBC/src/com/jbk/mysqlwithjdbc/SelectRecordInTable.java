package com.jbk.mysqlwithjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectRecordInTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Statement stmt=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			stmt=con.createStatement();
			String sql="select id,fisrtName,lastName,age from Person";
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next())
			{
				int id=rs.getInt("id");
				int age=rs.getInt("age");
				String firstName=rs.getString("fisrtName");
				String lastName=rs.getString("lastName");
				
				System.out.println("Id is "+id+"||");
				System.out.println("age is "+age+"||");
				System.out.println("firstName is "+firstName +"||");
				System.out.println("lastName is "+lastName +"||");
			}
					
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
