package com.jbk.DMLOperationsWithStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementDelete {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		System.out.println(1);
Class.forName("com.mysql.jdbc.Driver");


System.out.println(2);

Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
System.out.println(3);

Statement stmt=con.createStatement();

System.out.println(4);

int y=stmt.executeUpdate("delete from employee where E_id=20");

System.out.println(5);





System.out.println(y);
	}

}
