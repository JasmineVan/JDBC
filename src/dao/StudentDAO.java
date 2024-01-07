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
		try {
			Connection c = JDBCUtil.getConnection();
			Statement st = JDBCUtil.getStatement(c);
			
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
			
			int rowEffect = st.executeUpdate(queryString);
			
			System.out.println("Insert " + rowEffect + (rowEffect > 1?" rows":" row") + " successfully.");
			
			JDBCUtil.closeConnection(c);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	public int update(Student t) {
		return 0;
	}

	public int delete(Student t) {
		// TODO Auto-generated method stub
		return 0;
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
