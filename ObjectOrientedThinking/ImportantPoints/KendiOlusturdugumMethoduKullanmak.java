package ImportantPoints;

public class KendiOlusturdugumMethoduKullanmak {

	public KendiOlusturdugumMethoduKullanmak() {

	}

	public double getBMI() {
		double bmi = 5.4;
		return bmi;
	}

	public String getStatus() {
		double bmi = getBMI();
		if (bmi < 18.5)
			return "Underweight";
		else {
			return "working";
		}
	}
}