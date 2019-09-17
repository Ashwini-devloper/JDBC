package com.jbk.mysqlwithjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertRecordInTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Statement stmt=null;
try
{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
	stmt=con.createStatement();
	
//	String sql="insert into Person values (22,'c','d',25)";
	//stmt.executeUpdate(sql);
	
	String sql="insert into Person values(33,'E','F',30)";
	stmt.executeUpdate(sql);
	
//	sql="insert into Person values(44,'S','M',28)";
	//stmt.executeUpdate(sql);
	
	System.out.println("all record inserted");
	
}catch(Exception e)

{
	e.printStackTrace();
}
	}

}
