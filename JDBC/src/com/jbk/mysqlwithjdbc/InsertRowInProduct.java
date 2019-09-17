package com.jbk.mysqlwithjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertRowInProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Statement stmt=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			stmt=con.createStatement();
			
String sql="insert into products values (1001,'PEN','Pen Red',5000,1.23)";
			stmt.executeUpdate(sql);
			
			System.out.println("all record inserted");
			
		}catch(Exception e)

		{
			e.printStackTrace();
		}
			}


}
