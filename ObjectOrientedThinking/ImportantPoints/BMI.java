package ImportantPoints;

public class BMI {
	
	BMI() {
		
	}
	
	public double getBMI() {
		double bmi = 5;
		return bmi;
	}
	
	public String getStatus() {
		double bmi = getBMI();
		if (bmi < 5) {
			return "calisiyor";
		}
		else {
			return "calisiyor";
		}
		
	}
}
