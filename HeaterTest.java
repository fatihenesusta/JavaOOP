package NesneYonelimliProgramlama;

public class HeaterTest {
	public static void main(String[] args) {
		Heater HT1 = new Heater();
		HT1.turnOff();
		HT1.setDegree(15);
		HT1.setMinute(10);
		System.out.println("The device is currently (on = true, off = false): " + HT1.on + "\nThe degree of the device is at: " + HT1.degree + "\nThe device will be working for: " + HT1.minute + " minutes");
	}
}
