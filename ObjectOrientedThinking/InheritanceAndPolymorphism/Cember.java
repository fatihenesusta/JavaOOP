package InheritanceAndPolymorphism;

import java.util.Date;

public class Cember extends GeometrikNesne {
	private double yaricap;

	public Cember() {

	}

	public Cember(double yaricap) {
		this.yaricap = yaricap;
	}

	public Cember(double yaricap, String renk, boolean dolu) {
		this.yaricap = yaricap;
		setRenk(renk);
		setDolu(dolu);
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
