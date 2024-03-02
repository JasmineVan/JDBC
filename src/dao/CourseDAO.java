package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;

import database.JDBCUtil;
import enums.Gender;
import enums.StudentType;
import model.Course;
import model.Student;

public class CourseDAO implements DAOInterface<Course>{

	public static CourseDAO getInstance() {
		return new CourseDAO();
	}
	
	public int insert(Course t) {
		int rowEffect = 0;
		try {
			// Step 1: Connect to Database			
			Connection c = JDBCUtil.getConnection();
			
			// Step 2: Create Statement object
			Statement st = JDBCUtil.getStatement(c);
			
			// Step 3: Execute SQL command
			String queryString = "INSERT INTO Courses(CourseID, Description, Levels, Price, PictureURL) VALUES('"
					+t.getCourseID()
					+"','"
					+t.getDescription()
					+"','"
					+t.getLevels()
					+"','"
					+t.getPrice()
					+"','"
					+t.getPictureURL()
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

	public int update(Course t) {
		int rowEffect = 0;
		try {
			Connection c = JDBCUtil.getConnection();
			Statement st = JDBCUtil.getStatement(c);
			
			String queryString = "UPDATE Courses SET " +
			"CourseID ='"+ t.getCourseID() + "'," +
			"Description ='"+ t.getDescription() + "'," +
			"Levels ='"+ t.getLevels() + "'," +
			"Price ='"+ t.getPrice() + "'," +
			"PictureURL ='"+ t.getPictureURL() + "'" + 
			"WHERE CourseID ='"+ t.getCourseID() + "'";
			
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

	public int delete(Course t) {
		int rowEffect = 0;
		try {
			Connection c = JDBCUtil.getConnection();
			Statement st = JDBCUtil.getStatement(c);
			
			String queryString = "DELETE from Courses WHERE CourseID ='"+ t.getCourseID() + "'";
			
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

	public ArrayList<Course> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Course selectByID(Course t) {
		Course course = null;
		try {
			Connection c = JDBCUtil.getConnection();
			Statement st = JDBCUtil.getStatement(c);
			
			String queryString = "SELECT * from Courses WHERE CourseID = '"+ t.getCourseID() +"'";
			
			System.out.println(queryString);
			
			ResultSet rs = st.executeQuery(queryString);
			while (rs.next()) {
				String courseID = rs.getString("UserID");
				String description = rs.getString("Description");
				Integer levels = rs.getInt("Levels");
				Double price = rs.getDouble("Price");
				String pictureURL = rs.getString("PictureURL");
				
				course = new Course(courseID, description, levels, price, pictureURL);
			}
			
			System.out.println("Successfully.");
			
			JDBCUtil.closeConnection(c);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return course;
	}

	public Course selectByCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
