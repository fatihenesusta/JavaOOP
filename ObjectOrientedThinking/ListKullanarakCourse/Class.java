package ListKullanarakCourse;

import java.util.ArrayList;

public class Class {
	private String courseName;
	private ArrayList students;

	public Class(String courseName) {
		this.courseName = courseName;
		students = new ArrayList();
	}	
	

	public void addStudent(String studentName) {
		students.add(studentName);

	}

	public void dropStudent(String studentName) {
		if (students.contains(studentName) == false) {
			throw new RuntimeException("Student has not been found!");
		}
		students.remove(studentName);
	}

	public String getCourseName() {
		return courseName;
	}


	public int getNumberOfStudents() {
		return students.size();
	}
}
