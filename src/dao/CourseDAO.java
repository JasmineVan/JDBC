package dao;

import java.util.ArrayList;

import model.Course;

public class CourseDAO implements DAOInterface<Course>{
	
	public static CourseDAO getInstance() {
		return new CourseDAO();
	}

	public int insert(Course t) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(Course t) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(Course t) {
		// TODO Auto-generated method stub
		return 0;
	}

	public ArrayList<Course> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Course selectByID(Course t) {
		// TODO Auto-generated method stub
		return null;
	}

	public Course selectByCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
