package NesneYonelimliProgramlama;

public class NesneDizisi {
	public static void main(String[] args) {
		CemberPrivate[] dizi = new CemberPrivate[100];
		
		System.out.println(dizi[15]);
		
		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = new CemberPrivate(i + 1);
		}
		
		System.out.println(dizi[15].getYariCap());
		System.out.println(dizi[16].alanHesapla());
		System.out.println(dizi[17].cevreHesabi());
		System.out.println(dizi[18].getNesneSayisi());
		
	}
}
