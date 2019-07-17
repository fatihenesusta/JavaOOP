package NesneYonelimliProgramlama;

public class CemberPrivate {
	private double yariCap;

	private static int nesneSayisi = 0;

	public CemberPrivate() {
		yariCap = 5;
		nesneSayisi++;
	}

	public CemberPrivate(double y) {
		yariCap = y;
		nesneSayisi++;
	}

	public double alanHesapla() {
		return yariCap * yariCap * Math.PI;
	}

	public double cevreHesabi() {
		return 2 * Math.PI * yariCap;
	}

	public double getYariCap() {
		return yariCap;
	}

	public void setYariCap(double yariCap) {		
		if ( yariCap > 0) {
			this.yariCap = yariCap;	
		} else {
			System.err.println("Hatalı bir giriş");
		}
		
	}

	public static int getNesneSayisi() {
		return nesneSayisi;
	}

	public static void setNesneSayisi(int nesneSayisi) {
		CemberPrivate.nesneSayisi = nesneSayisi;
	}

}
