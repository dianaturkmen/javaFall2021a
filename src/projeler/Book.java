package projeler;

import java.util.List;
import java.util.Scanner;

public class Book {

	String kitapAdi;
	String yazarAdi;
	double kitapFiyati;
	Long kitapNo;
	
	public Book () {
	}
	
	public Book (String kitapAdi, String yazarAdi,	double kitapFiyati, long kitapNo) {
		
		this.kitapAdi=kitapAdi;
		this.yazarAdi=yazarAdi;
		this.kitapFiyati=kitapFiyati;
		this.kitapNo=kitapNo;
		
	}

	public  List<Kutuphane> kitapEkle() {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen kitap adi giriniz");
		String kitapAdi= scan.nextLine();
		
		
		System.out.println("Lutfen yazar adi giriniz");
		String yazarAdi= scan.nextLine();
		
		System.out.println("Lutfen kitabin fiyatini giriniz");
		double kitapFiyati=scan.nextDouble();
		
		Book kitap=new Book ();
		
		return kitap;
	}
 
}	

	
	