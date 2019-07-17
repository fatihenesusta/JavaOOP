package InheritanceAndPolymorphism;

public class SuperOrnegi extends GeometrikNesne {
	private double yaricap;

	public SuperOrnegi() {

	}

	public SuperOrnegi(double yaricap) {
		this.yaricap = yaricap;
	}

	public SuperOrnegi(double yaricap, String renk, boolean dolu) {
		super(renk, dolu);
		this.yaricap = yaricap;
	

	}

	public double alanHesapla() {
		return yaricap * yaricap * Math.PI;
	}

	public double cevreHesapla() {
		return 2 * yaricap * Math.PI;
	}

	public double getCap() {
		return 2 * yaricap;
	}

	public void yazdir() {
		System.out.println(getOlusturulmaTarihi() + " tarihinde olusturuldu ve yaricapi: " + yaricap);
	}

	public double getYaricap() {
		return yaricap;
	}

	public void setYaricap(double yaricap) {
		this.yaricap = yaricap;
	}
}
