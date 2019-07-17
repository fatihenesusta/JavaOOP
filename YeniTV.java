package NesneYonelimliProgramlama;

public class YeniTV {
	int channel = 1;
	int volume = 1;
	boolean on = false;
	
	public YeniTV() {
		channel = 1;
		volume = 1;
		on = false;
	}
	
	public void tvOn() {
		on = true;
	}
	
	public void tvOff() {
		on = false;
	}
	
	public void setChannel(int newChannel) {
		if (on && newChannel >= 1 && newChannel <= 120)
			channel = newChannel;
	}
	
	
	public void setVolume(int newVolume) {
		if (on && volume >= 1 && volume <= 7)
			volume = newVolume;
	}
	
	public void channelDown() {
		if ( on & channel < 120)
			channel--;
	}
	
	public void channelUp() {
		if ( on & channel > 1)
			channel++;
	}
	
	
}
