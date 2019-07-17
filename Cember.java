package NesneYonelimliProgramlama;

public class Cember {
	double yariCap;

	static int nesneSayisi = 0;

	Cember() {
		yariCap = 5;
		nesneSayisi++;
	}

	Cember(double y) {
		yariCap = y;
		nesneSayisi++;
	}

	double alanHesapla() {
		return yariCap * yariCap * Math.PI;
	}

	double cevreHesabi() {
		return 2 * Math.PI * yariCap;
	}

	void yariCapiGuncelle(double y) {
		yariCap = y;
	}

	public double getYariCap() {
		return yariCap;
	}

	public void setYariCap(double yariCap) {
		this.yariCap = yariCap;
	}

	public static int getNesneSayisi() {
		return nesneSayisi;
	}

	public static void setNesneSayisi(int nesneSayisi) {
		Cember.nesneSayisi = nesneSayisi;
	}

}
