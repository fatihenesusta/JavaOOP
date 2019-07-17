package NesneYonelimliProgramlama;

public class TestTV {
	public static void main(String[] args) {
		TV tv1 = new TV();
		tv1.turnOn();
		tv1.setChannel(30);
		tv1.setVolume(5);
		
		TV tv2 = new TV();
		tv2.turnOn();
		tv2.setChannel(20);
		tv2.setVolume(2);
		
		
		System.out.println("tv1's channel is: " + tv1.channel + " volume of the tv is: " + tv1.volumeLevel);
		System.out.println("tv2's channel is: " + tv2.channel + " volume of the tv is: " + tv2.volumeLevel);
		
	}
}
