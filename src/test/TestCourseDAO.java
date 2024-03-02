package test;

import java.util.ArrayList;

import dao.CourseDAO;
import dao.StudentDAO;
import enums.Gender;
import enums.StudentType;
import model.Course;
import model.Student;

public class TestCourseDAO {
	public static void main(String[] args) {
		// Test Insert
		Course c1 = new Course("0000000001", "Safe Entry into Pool", 1, 2000000.0,
				"https://ui-avatars.com/api/?name=SP");
		System.out.println(c1.toString());
		CourseDAO.getInstance().insert(c1);

		// Test Update
		Course c2 = new Course("0000000001", "Safe Entry into Pool 2", 1, 2000000.0,
				"https://ui-avatars.com/api/?name=SP");
		System.out.println(c2.toString());

		CourseDAO.getInstance().update(c2);

		// Test Delete
		CourseDAO.getInstance().delete(c2);

		// Test SelectAll
		ArrayList<Course> studentArrayList = CourseDAO.getInstance().selectAll();
		if (studentArrayList != null) {
			for (Course course : studentArrayList) {
				System.out.println(course.toString());
			}

		}
	}
}
