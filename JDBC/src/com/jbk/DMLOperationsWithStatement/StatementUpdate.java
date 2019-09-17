package com.jbk.DMLOperationsWithStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementUpdate {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
Class.forName("com.mysql.jdbc.Driver");

System.out.print(1);

Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");

System.out.println(2);

Statement stmt=con.createStatement();

System.out.println(3);

int z=stmt.executeUpdate("update employee SET E_id=1 where E_name='abc'");
System.out.println(z);
System.out.println(4);


	}

}
