package NesneYonelimliProgramlama;

public class YeniClass {
	private String ad;
	private String soyad;
	private static int mevcut = 0;
	
	public YeniClass (String ad, String soyad) {
		
		this.ad = ad;
		this.soyad = soyad;
		mevcut++;
		System.out.println(ad+" "+soyad+" eklendi. Sýnýf mevcudu: "+mevcut);
	}
}
