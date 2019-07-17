package NesneYonelimliProgramlama;

public class TestCemberPrivate {
	public static void main(String[] args) {
		CemberPrivate c1 = new CemberPrivate(5);

		System.out.println("Yari capi " + c1.getYariCap() + " alani: " + c1.alanHesapla());

		c1.setYariCap(c1.getYariCap() * 1.1);

		System.out.println("Yari capi " + c1.getYariCap() + " alani: " + c1.alanHesapla());

		System.out.println(CemberPrivate.getNesneSayisi());

		cemberYazdir(c1);
		
		System.out.println("Yari capi " + c1.getYariCap() + " alani: " + c1.alanHesapla());
	
		
		int kacDefa = 3;
		alanYazdir(c1, kacDefa);
		System.out.println(kacDefa);
	}

	private static void cemberYazdir(CemberPrivate c) {
		System.out.println("Yari capi " + c.getYariCap() + " alani: " + c.alanHesapla());
	}

	private static void alanYazdir(CemberPrivate c, int kacDefa) {
		
		for (int i = 0; i < kacDefa; i++) {
			System.out.println("Yari capi " + c.getYariCap() + " alani: " + c.alanHesapla());
			c.setYariCap(c.getYariCap()+1);
		}
		kacDefa = 99;
	}
	
}