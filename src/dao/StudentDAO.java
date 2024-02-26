package dao;

import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;

import database.JDBCUtil;
import model.Student;

public class StudentDAO implements DAOInterface<Student>{

	public static StudentDAO getInstance() {
		return new StudentDAO();
	}
	
	public int insert(Student t) {
		int rowEffect = 0;
		try {
			// Step 1: Connect to Database			
			Connection c = JDBCUtil.getConnection();
			
			// Step 2: Create Statement object
			Statement st = JDBCUtil.getStatement(c);
			
			// Step 3: Execute SQL command
			String queryString = "INSERT INTO Students(UserID, FirstName, LastName, Email, Gender, Password, Address, PictureURL, CreateDate, DateOfBirth, IsActive, Type) VALUES('"
					+t.getUserID()
					+"','"
					+t.getFirstName()
					+"','"
					+t.getLastName()
					+"','"
					+t.getEmail()
					+"','"
					+t.getGender()
					+"','"
					+t.getPassword()
					+"','"
					+t.getAddress()
					+"','"
					+t.getPictureURL()
					+"','"
					+t.getCreateDate()
					+"','"
					+t.getDateOfBirth()
					+"','"
					+t.getIsActive()
					+"','"
					+t.getType()
					+"')";
			
			System.out.println(queryString);
			
			rowEffect = st.executeUpdate(queryString);
			
			// Step 4: Handle or Notification
			System.out.println("Insert " + rowEffect + (rowEffect > 1?" rows":" row") + " successfully.");
			
			// Step 5: Close connection
			JDBCUtil.closeConnection(c);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rowEffect;
	}

	public int update(Student t) {
		int rowEffect = 0;
		try {
			Connection c = JDBCUtil.getConnection();
			Statement st = JDBCUtil.getStatement(c);
			
			String queryString = "UPDATE Students SET " +
			"UserID ='"+ t.getUserID() + "'," +
			"FirstName ='"+ t.getFirstName() + "'," +
			"LastName ='"+ t.getLastName() + "'," +
			"Email ='"+ t.getEmail() + "'," +
			"Gender ='"+ t.getGender() + "'," +
			"Password ='"+ t.getPassword() + "'," +
			"Address ='"+ t.getAddress() + "'," +
			"PictureURL ='"+ t.getPictureURL() + "'," +
			"CreateDate ='"+ t.getCreateDate() + "'," +
			"DateOfBirth ='"+ t.getDateOfBirth() + "'," +
			"IsActive ='"+ t.getIsActive() + "'," +
			"Type ='"+ t.getType() + "'" + 
			"WHERE UserID ='"+ t.getUserID() + "'";
			
			System.out.println(queryString);
			
			rowEffect = st.executeUpdate(queryString);
			
			System.out.println("Update " + rowEffect + (rowEffect > 1?" rows":" row") + " successfully.");
			
			JDBCUtil.closeConnection(c);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rowEffect;
	}

	public int delete(Student t) {
		int rowEffect = 0;
		try {
			Connection c = JDBCUtil.getConnection();
			Statement st = JDBCUtil.getStatement(c);
			
			String queryString = "DELETE from Students WHERE UserID ='"+ t.getUserID() + "'";
			
			System.out.println(queryString);
			
			rowEffect = st.executeUpdate(queryString);
			
			System.out.println("Delete " + rowEffect + (rowEffect > 1?" rows":" row") + " successfully.");
			
			JDBCUtil.closeConnection(c);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rowEffect;
	}

	public ArrayList<Student> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Student selectByID(Student t) {
		// TODO Auto-generated method stub
		return null;
	}

	public Student selectByCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}

}
