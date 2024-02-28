package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;

import database.JDBCUtil;
import enums.Gender;
import enums.StudentType;
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
		int size = 0;
		ArrayList<Student> studentArrayList = new ArrayList<Student>();
		try {
			Connection c = JDBCUtil.getConnection();
			Statement st = JDBCUtil.getStatement(c);
			
			String queryString = "SELECT * from Students";
			
			System.out.println(queryString);
			
			ResultSet rs = st.executeQuery(queryString);
			while (rs.next()) {
				size++;
				String userID = rs.getString("UserID");
				String firstName = rs.getString("FirstName");
				String lastName = rs.getString("LastName");
				String email = rs.getString("Email");
				String password = rs.getString("Password");
				String address = rs.getString("Address");
				String pictureURL = rs.getString("PictureURL");
				LocalDate createDate = rs.getDate("CreateDate").toLocalDate();
				LocalDate dateOfBirth = rs.getDate("DateOfBirth").toLocalDate();
				Boolean isActive = rs.getBoolean("IsActive");
				StudentType type = StudentType.valueOf(rs.getString("Type"));
				Gender gender = Gender.valueOf(rs.getString("Gender"));
				
				Student student = new Student(userID, firstName, lastName, email, password, address, pictureURL, createDate, dateOfBirth, isActive, type, gender);
				studentArrayList.add(student);
			}
			
			System.out.println("Select " + size + (size > 1?" rows":" row") + " successfully.");
			
			JDBCUtil.closeConnection(c);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return studentArrayList;
	}

	public Student selectByID(Student t) {
		Student student = null;
		try {
			Connection c = JDBCUtil.getConnection();
			Statement st = JDBCUtil.getStatement(c);
			
			String queryString = "SELECT * from Students WHERE UserID = '"+ t.getUserID() +"'";
			
			System.out.println(queryString);
			
			ResultSet rs = st.executeQuery(queryString);
			while (rs.next()) {
				String userID = rs.getString("UserID");
				String firstName = rs.getString("FirstName");
				String lastName = rs.getString("LastName");
				String email = rs.getString("Email");
				String password = rs.getString("Password");
				String address = rs.getString("Address");
				String pictureURL = rs.getString("PictureURL");
				LocalDate createDate = rs.getDate("CreateDate").toLocalDate();
				LocalDate dateOfBirth = rs.getDate("DateOfBirth").toLocalDate();
				Boolean isActive = rs.getBoolean("IsActive");
				StudentType type = StudentType.valueOf(rs.getString("Type"));
				Gender gender = Gender.valueOf(rs.getString("Gender"));
				
				student = new Student(userID, firstName, lastName, email, password, address, pictureURL, createDate, dateOfBirth, isActive, type, gender);
			}
			
			System.out.println("Successfully.");
			
			JDBCUtil.closeConnection(c);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return student;
	}

	public Student selectByCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}

}
