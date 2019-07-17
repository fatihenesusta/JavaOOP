package InheritanceAndPolymorphism;

import java.util.Date;

public class GeometrikNesne {
	private String renk;
	private boolean dolu; // default false
	private Date olusturulmaTarihi;

	public GeometrikNesne() {
		renk = "Beyaz";
		olusturulmaTarihi = new Date();
	}

	public GeometrikNesne(String renk, boolean dolu) {
		this();
		this.renk = renk;
		this.dolu = dolu;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public boolean isDolu() {
		return dolu;
	}

	public void setDolu(boolean dolu) {
		this.dolu = dolu;
	}

	public Date getOlusturulmaTarihi() {
		return olusturulmaTarihi;
	}

	public void setOlusturulmaTarihi(Date olusturulmaTarihi) {
		this.olusturulmaTarihi = olusturulmaTarihi;
	}

	public String toString() {
		return "created on " + olusturulmaTarihi + "\nRenk: " + renk + " ve dolu mu: " + dolu;
	}
}
