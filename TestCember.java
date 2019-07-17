package NesneYonelimliProgramlama;

public class TestCember {
	public static void main(String[] args) {
		Cember cember1 = new Cember(0);
		
		cember1.yariCapiGuncelle(56.69);
		
		
		System.out.println(cember1.alanHesapla());
		
		Cember cember2 = new Cember(0);
		cember2.yariCapiGuncelle(1);
		
		
		System.out.println(cember2.alanHesapla());
		
	}
}
