package test;

import java.time.LocalDate;

import dao.StudentDAO;
import enums.Gender;
import enums.StudentType;
import model.Student;

public class TestStudentDAO {
	public static void main(String[] args) {
		// Test Insert
		Student s1 = new Student("0000000001", "Thuong", "Trinh Van", "thuongtv@1cinnvation.com", "12345", "Long An",
				"https://ui-avatars.com/api/?name=VT", LocalDate.now(), LocalDate.of(2000, 1, 20), true,
				StudentType.Standard, Gender.Male);
		System.out.println(s1.toString());
		StudentDAO.getInstance().insert(s1);

		// Test Update
		Student s2 = new Student("0000000001", "Jasmine", "Van", "thuongtv@1cinnvation.com", "12345", "Long An",
				"https://ui-avatars.com/api/?name=VT", LocalDate.now(), LocalDate.of(2000, 1, 20), true,
				StudentType.Standard, Gender.Male);
		System.out.println(s2.toString());

		StudentDAO.getInstance().update(s2);
		
		// Test Delete
		StudentDAO.getInstance().delete(s2);
	}
}
