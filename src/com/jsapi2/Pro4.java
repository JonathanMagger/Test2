package com.jsapi2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Pro4 {
		//JDBC driver name and database URL
		static final String DB_URL = "jdbc:mysql://localhost:3306/myjavacode";
		//Database credentials
		static final String USER = "root";
		static final String PASS = "root";
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		
		try {
			//STEP 3 : open a connection
			System.out.println("Connecting to Database... ");
			conn = DriverManager.getConnection(DB_URL, USER,PASS);
			
			//STEP 4 : Execute a query
			System.out.println("Creating Statement... ");
			stmt = conn.createStatement();
			String sql;
			sql = "Select name, genre, year From movies";
			ResultSet rs = stmt.executeQuery(sql);
			
			System.out.println("QUerying Database. . . ");
			System.out.println();
			String format = "| %1$-5s| %2$-6s| %3$-5s|\n\n";
			System.out.format(format, "Name", "Genre", "Year");
			while (rs.next()) {
				
				String name = rs.getString("name");
				String genre = rs.getString("genre");
				String year = rs.getString("year");
				
				System.out.format(format, name, genre, year);
			}
			rs.close();
			stmt.close();
			conn.close();
			
			Thread.sleep(2000);
			System.out.println("Connection Closed..");
			
		}catch (SQLException se) {
			se.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(stmt!=null)
					stmt.close();
			}catch(SQLException se2) {
			}//nothing we can do
			try {
				if (conn!=null)
					conn.close();
			}catch(SQLException se) {
				se.printStackTrace();
			}//end finally try
		}//end try

	}

}
