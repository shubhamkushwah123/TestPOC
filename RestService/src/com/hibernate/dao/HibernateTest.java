package com.hibernate.dao;

import java.sql.*;

public class HibernateTest {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// Create a variable for the connection string.
		String connectionUrl = "jdbc:postgresql://localhost:5432/HibernateMessenger";

		// Declare the JDBC objects.
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		String username="postgres";
		String password="password";
		
        	try {
        		// Establish the connection.
        		Class.forName("org.postgresql.Driver");
            		con = DriverManager.getConnection(connectionUrl,username,password);
            		if(con==null)
            		{
            			System.out.println("No Connection");
            		}
            		else
            		{
            			System.out.println("Congratulations. You have successfully created Database");
            		}
        	}
        	finally{}
            		// Create and execute an SQL statement that returns some data.
            	/*	String SQL = "SELECT TOP 10 * FROM Person.Contact";
            		stmt = con.createStatement();
            		rs = stmt.executeQuery(SQL);
            
            		// Iterate through the data in the result set and display it.
            		while (rs.next()) {
            			System.out.println(rs.getString(4) + " " + rs.getString(6));
            		}
        	}
        
		// Handle any errors that may have occurred.
		catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			if (rs != null) try { rs.close(); } catch(Exception e) {}
	    		if (stmt != null) try { stmt.close(); } catch(Exception e) {}
	    		if (con != null) try { con.close(); } catch(Exception e) {}
		}
	}*/

}

}
