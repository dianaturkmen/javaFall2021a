package projeler;

import java.time.LocalTime;

public class Kitap  {
	String kitapAdi;
	String yazarAdi;
	double kitapFiyati;
	long kitapNo;
	private int a;
	
	Kitap ( ) {
			}
	Kitap (String kitapAdi,	String yazarAdi, double kitapFiyati,long kitapNo) {
		this.kitapAdi=kitapAdi;
		this.kitapFiyati=kitapFiyati;
		this.kitapFiyati=kitapFiyati;
		this.kitapNo=kitapNo;
	 }
	
	public long getKitapNo() {
		return kitapNo;
	}
	public void setKitapNo(long kitapNo) {
		this.kitapNo = kitapNo;
	}
	public String getKitapAdi() {
		return kitapAdi;
	}
	public void setKitapAdi(String kitapAdi) {
		this.kitapAdi = kitapAdi;
	}
	public String getYazarAdi() {
		return yazarAdi;
	}
	public void setYazarAdi(String yazarAdi) {
		this.yazarAdi = yazarAdi;
	}
	public double getKitapFiyati() {
		return kitapFiyati;
	}
	public void setKitapFiyati(double kitapFiyati) {
		this.kitapFiyati = kitapFiyati;
	}
	
	public void kitapyaz () {
		//System.out.println("KITAP BILGILERI ");
		//System.out.println("======================================");
		System.out.print("" + getKitapNo()) ;
		System.out.print(" - "+ getKitapAdi());
		System.out.print(" - "+ getYazarAdi());
		System.out.println(" - "+  getKitapFiyati());
	}
	
}



