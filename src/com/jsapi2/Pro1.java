package com.jsapi2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

// create table movies(id int Auto_increment Primary Key, name varchar (150), genre varchar(50), year varchar (10), imdb_rating varchar (10));
public class Pro1 {
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
			
			Thread.sleep(2000);
			System.out.println("Database is Connected ");
			
			Thread.sleep(2000);
			//STEP 4 : Execute a query
			System.out.println("Creating Tables in given Database... ");
			stmt = conn.createStatement();
			
			String sql= "create table movies(id int Auto_increment Primary Key, name varchar (150), genre varchar(50), year varchar (10), imdb_rating varchar (10))";
			
			stmt.executeUpdate(sql);
			Thread.sleep(2000);
			System.out.println("Movie Table is Created in database... ");
	
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
