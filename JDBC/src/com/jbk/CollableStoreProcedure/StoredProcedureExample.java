package com.jbk.CollableStoreProcedure;
import java.sql.DriverManager;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
public class StoredProcedureExample {
	public static void main(String[] args) {
	      String jdbcUrl = "jdbc:mysql://localhost:3306/student";
	      String username = "root";
	      String password = "root";
	      String sql = "{call product(?,?,?)}";

	      try (Connection con = DriverManager.getConnection(jdbcUrl, username, password); 
	            CallableStatement stmt=con.prepareCall(sql);) {
	         //Set IN parameter
	         stmt.setInt(1, 1);  
	         //Set OUT parameter
	         stmt.registerOutParameter(2, Types.VARCHAR);
	     //Set INOUT parameter
	         stmt.setDouble(3, 15.15);
	         stmt.registerOutParameter(3, Types.DOUBLE);
	         
	         //Execute stored procedure
	         stmt.execute();
	         
	         // Get Out and InOut parameters
	         System.out.println("Product Name = "+stmt.getString(2));
	         System.out.println("Product Old Price = "+stmt.getDouble(3));
	         
	      } catch (SQLException e) {
	         e.printStackTrace();
	      }
	   }
}
