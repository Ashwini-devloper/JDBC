package com.jbk.mysqlwithjdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class MysqlConn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
	System.out.println("connected");
}catch(Exception e)
{
	System.out.println("error to connect mysql");
}
	}

}
