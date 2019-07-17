package NesneYonelimliProgramlama;

public class Denemeler {
	private String ad;
	private String soyad;
	private static int mevcut = 0;
	
	public Denemeler(String a, String s){
		ad = a;
		soyad = s;
		mevcut++;
		System.out.println(ad+" "+soyad+" eklendi. Sýnýf mevcudu: "+mevcut);
	}
}
