package NesneYonelimliProgramlama;

public class Heater {
	int degree = 1;
	int minute = 1;
	boolean on = false;
	
	public Heater() {
		degree = 1;
		minute = 1;
		on = false;
	}
	
	public void turnOn() {
		on = true;
	}
	
	public void turnOff() {
		on = false;
	}
	
	public void setDegree(int newDegree) {
		degree = newDegree;
	}
	
	public void increaseDegree() {
		if ( on & degree >= 1 && degree <= 10)
			degree++;
	}
	
	public void decreaseDegree() {
		if (on & degree >= 1 && degree <= 10)
			degree--;
	}
	
	public void setMinute(int newMinute) {
		minute = newMinute;
	}
	
	
}
