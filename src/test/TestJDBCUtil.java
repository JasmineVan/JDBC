package test;

import java.sql.Connection;
import java.util.Scanner;

import database.JDBCUtil;
import model.Student;

public class TestJDBCUtil {
	public static void main(String[] args) {
		// Create connection and print connection information		
		Connection connection = JDBCUtil.getConnection();
		JDBCUtil.printConnectionInformation(connection);
		JDBCUtil.closeConnection(connection);
	}
}
