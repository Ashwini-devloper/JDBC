package com.jbk.mysqlwithjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertRecordInSelectedColumns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Statement stmt=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			stmt=con.createStatement();
			
//String sql="insert into productsdetails(pcode,name,quantity,price) values('PEC','pencil2B',100000,0.48)";
			//stmt.executeUpdate(sql);
			
		//	String sql="insert into productsdetails(pcode,name) values('PEC1','pencil2B')";
			//stmt.executeUpdate(sql);
			
			//String sql="insert into productsdetails values(NULL,NULL,NULL,NULL)";
			//stmt.executeUpdate(sql);
			
			/*String sql="select * from productsdetails";
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next())
			{
				String pcode=rs.getString("pcode");
				String name=rs.getString("name");
				int quantity=rs.getInt("quantity");
				int price=rs.getInt("price");
				System.out.println("pcode is "+pcode+"||");
				System.out.println("name is "+name+"||");
				System.out.println("quantity is "+quantity +"||");
				System.out.println("price is "+price +"||");
			}*/
			//String sql="delete from productsdetails where pcode='PEC'";
			//stmt.executeUpdate(sql);
				
		String sql="select name,price from productsdetails";
			ResultSet rs=stmt.executeQuery(sql);
			
			while(rs.next())
			{
				//String pcode=rs.getString("pcode");
				String name=rs.getString("name");
				//int quantity=rs.getInt("quantity");
				int price=rs.getInt("price");
				//System.out.println("pcode is "+pcode+"||");
				System.out.println("name is "+name+"||");
				//System.out.println("quantity is "+quantity +"||");
				System.out.println("price is "+price +"||");
			}
			
		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}

}
