package com.jbk.DMLOperationsWithPreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class PreparedStatementAllDMLOperations {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

System.out.println(1);
Class.forName("com.mysql.jdbc.Driver");

System.out.println(2);
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");

System.out.println(3);

String sql="insert into emp values(?,?)";

//String sql="delete from emp where Eid=2";
PreparedStatement psta=con.prepareStatement(sql);

for(int i=2;i<100;i++)
{
	psta.setString(1, "1"+i);
	psta.setString(2, "abhgf");
	//psta.setString(arg0, arg1);
	//psta.setString(3, "nashik");
	int z=psta.executeUpdate();
	System.out.println(z);
}
System.out.println(3);



System.out.println(4);



}




	}

