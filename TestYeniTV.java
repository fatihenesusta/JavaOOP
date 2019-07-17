package NesneYonelimliProgramlama;

public class TestYeniTV {
	public static void main(String[] args) {
		YeniTV tv1 = new YeniTV();
		
		tv1.tvOn();
		tv1.setVolume(5);
		tv1.setChannel(10);
		
		
		
		YeniTV tv2 = new YeniTV();
		
		tv2.tvOn();
		tv2.setChannel(15);
		tv2.setVolume(5);
	
	
	System.out.println("The channel of TV1 is currently at: " + tv1.channel + "\nIt is currently at volume of: " + tv1.volume);
	System.out.println("---------");
	System.out.println("The channel of TV2 is currently at: " + tv2.channel + "\nIt is currently at volume of: " + tv2.volume);

	
	}

}
