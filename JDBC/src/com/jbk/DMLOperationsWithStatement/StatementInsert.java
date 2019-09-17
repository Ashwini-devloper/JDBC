package com.jbk.DMLOperationsWithStatement;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.Statement;

public class StatementInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
 System.out.println(1);
 
		Class.forName("com.mysql.jdbc.Driver");
		 System.out.println(2);
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/test","root","root");
		 System.out.println(3);
		 
		 Statement stmt=con.createStatement();
		 
		 System.out.println(4);
		 
		 String sql="insert into employee values(21,'javabykiran','pune')";
		 
		 System.out.println(5);
		 
		 int x=stmt.executeUpdate(sql);
		 System.out.println(6);
		 System.out.println(x);
		 
		 
		 
		 
	}

}
