package BMI;

public class TestBMI {
	public static void main(String[] args) {
		BMI user01 = new BMI("John", 25, 34, 1.77);
		
		System.out.println(user01.getStatus());
	}
}
