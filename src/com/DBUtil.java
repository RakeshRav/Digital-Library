package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil 
{
	static
	{
		//register driver
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() throws SQLException
	{
		return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "123");
	}
	
	public static void closeAllDBResources(ResultSet rs, Statement stmt, Connection con)
	{
		if(rs != null)
		{
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		if(stmt != null)
		{
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		if(con != null)
		{
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
