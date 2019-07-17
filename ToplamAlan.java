package NesneYonelimliProgramlama;

public class ToplamAlan {
	public static void main(String[] args) {
		CemberPrivate[] dizi = diziOlustur();
		
		diziYazdir(dizi);
	}

	private static void diziYazdir(CemberPrivate[] dizi) {
		for (int i = 0; i < dizi.length; i++) {
	System.out.println("Yari capi " + dizi[i].getYariCap() + " alani: " + dizi[i].alanHesapla());
		}
		
		double toplamAlan = alanlariTopla(dizi);
		System.out.println(toplamAlan);
		
	}

	private static double alanlariTopla(CemberPrivate[] dizi) {
		double toplamAlan = 0;
		for (int i = 0; i < dizi.length; i++) {
			toplamAlan += dizi[i].alanHesapla();
		}
		
		String str = "fatihaa";
		String str2 = str.substring(3);
		System.out.println(str);
		System.out.println(str2);
		return toplamAlan;
	}

	private static CemberPrivate[] diziOlustur() {
		CemberPrivate[] dizi = new CemberPrivate[5];
		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = new CemberPrivate((Math.random()*100));
		}
		
		return dizi;
	}
}
