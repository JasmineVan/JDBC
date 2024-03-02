package database;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.microsoft.sqlserver.jdbc.SQLServerDriver;

import model.Student;


public class JDBCUtil {
	private static final String url = "jdbc:sqlserver://JASMINE:1433;databaseName=PoolManagement;integratedSecurity=true;encrypt=true;trustServerCertificate=true";

	/*
	 * Get connection
	 */
	public static Connection getConnection() {
		Connection c = null;
		
		try {
			// Register MySQL driver to DriverManager
			DriverManager.registerDriver(new SQLServerDriver());
			
			c = DriverManager.getConnection(url);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
	}
	
	/*
	 * Close connection
	 */
	public static void closeConnection(Connection c) {
		try {
			if (c != null) {
				c.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	/*
	 * Print connection information
	 */
	public static void printConnectionInformation(Connection c) {
		if (c != null) {
			try {
				DatabaseMetaData metadata = c.getMetaData();
				System.out.println(metadata.getDatabaseProductName());
				System.out.println(metadata.getDatabaseProductVersion());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	/*
	 * Create statement
	 */
	public static Statement getStatement(Connection c) {
		Statement st = null;
		
		try {
			st = c.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return st;
	}
}
