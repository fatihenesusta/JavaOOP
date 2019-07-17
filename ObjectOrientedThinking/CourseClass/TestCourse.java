package CourseClass;

public class TestCourse {
	public static void main(String[] args) {
		Course course1 = new Course("Turkish");
		course1.addStudent("Jack Newman");
		course1.addStudent("Daniel Lay");
		course1.addStudent("Meli Kean");
		
		System.out.println(course1.getNumberOfStudents());
		
		System.out.println("----------");
		
		course1.dropStudent("Jack Newman");
		course1.dropStudent("Daniel Lay");
		
		System.out.println("----------");
		
		String[] students = course1.getStudents();
		
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
	}
	
}
