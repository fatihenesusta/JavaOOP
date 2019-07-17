package CourseClass2;

import javax.management.RuntimeErrorException;

public class Course {
	private String courseName;
	private String[] students;
	private int numberOfStudents;
	private static final int MAX_STUDENTS = 60;

	public Course(String courseName) {
		this.courseName = courseName;
		students = new String[MAX_STUDENTS];
	}

	public void addStudent(String studentName) {
		if (numberOfStudents >= MAX_STUDENTS) {
			throw new RuntimeException("Class is full, you are not allowed to add more students.");
		}
		students[numberOfStudents] = studentName;
		numberOfStudents++;

	}

	public void dropStudent(String studentName) {
		int index = -1;
		for (int i = 0; i < numberOfStudents; i++) {
			if (students[i].equals(studentName)) {
				index = i;
				break;
			}
			if (index != i) {
				throw new RuntimeException("Student has not been found!");
			}
		}

		for (int i = index; i < numberOfStudents - 1; i++) {
			students[i] = students[i + 1];
		}

	}

	public String getCourseName() {
		return courseName;
	}

	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}
}
