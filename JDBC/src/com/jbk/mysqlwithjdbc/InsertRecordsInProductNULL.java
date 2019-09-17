package com.jbk.mysqlwithjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertRecordsInProductNULL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Statement stmt=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			stmt=con.createStatement();
			
String sql="insert into product values (NULL,'PEN','Pen Red',8000,1.23),(NULL,'PEN','Pen Red',8000,1.23)";
			stmt.executeUpdate(sql);
			
			System.out.println("all record inserted");
			
		}catch(Exception e)

		{
			e.printStackTrace();
		}
			}
	}

