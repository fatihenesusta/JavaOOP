package InheritanceAndPolymorphism;

import java.util.Date;

public class Dikdortgen extends GeometrikNesne {
	private double genislik;
	private double yukseklik;
	
	public Dikdortgen(double a) {
		
	}
	
	public Dikdortgen() {
		setGenislik(genislik);
		setYukseklik(yukseklik);
	}

	public double getGenislik() {
		return genislik;
	}

	public void setGenislik(double genislik) {
		this.genislik = genislik;
	}

	public double getYukseklik() {
		return yukseklik;
	}

	public void setYukseklik(double yukseklik) {
		this.yukseklik = yukseklik;
	}

}
