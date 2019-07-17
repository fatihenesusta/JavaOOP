package NesneYonelimliProgramlama;

public class TV {
	int channel = 1;
	int volumeLevel = 1;
	boolean on = false;

	public TV() {
		channel = 1;
		volumeLevel = 1;
		on = false;
	}

	public void turnOn() {
		on = true;
	}

	public void turnOff() {
		on = false;
	}

	public void setChannel(int newChannel) {
		if (on && newChannel >= 1 && newChannel <= 120)
			channel = newChannel;
	}

	public void setVolume(int newVolumeLevel) {
		if (on && newVolumeLevel >= 1 && newVolumeLevel <= 7)
			volumeLevel = newVolumeLevel;
	}

	public void channelUp() {
		if (on & channel < 120)
			channel++;
	}
	public void channelDown() {
		if (on & channel > 1)
			channel--;
	}
}
