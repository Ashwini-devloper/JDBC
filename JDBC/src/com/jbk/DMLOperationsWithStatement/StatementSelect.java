package com.jbk.DMLOperationsWithStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class StatementSelect {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		System.out.println(1);

	Class.forName("com.mysql.jdbc.Driver");
	System.out.println(2);
	
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
System.out.println(3);

Statement stmt=con.createStatement();
System.out.println(4);
String sql="select * from employee";

System.out.println(5);

ResultSet rs=stmt.executeQuery(sql);
System.out.println(6);

while(rs.next())
{
	String E_id=rs.getString(1);
	System.out.println("E_id"+E_id);
	
	String E_name=rs.getString(1);
	System.out.println("E_name"+E_name);
	
}

	
	
	}

}
