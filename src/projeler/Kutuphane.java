package projeler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kutuphane {
	List<Book> kitaplar = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
	public List<Book> kitapEkle(long kitapNo) {

		System.out.println("Lutfen kitap adi giriniz");
		String kitapAdi = scan.nextLine();
		System.out.println("Lutfen yazar adi giriniz");
		String yazarAdi = scan.nextLine();

		System.out.println("Lutfen kitabin fiyatini giriniz");
		double kitapFiyati = scan.nextDouble();

		Book book = new Book(kitapAdi, yazarAdi, kitapFiyati, kitapNo);

		kitaplar.add(book);
		System.out.println("kitap eklendi");
		return kitaplar;
	}

	public void listele (List<Book> kitaplar) {
		for (Book each :kitaplar) {
			System.out.println("KitapNo  " +each.kitapNo.toString()+"  Kitap Adi  "+" "+ each.kitapAdi+ " "+"  Yazar Adi  "+ " "+each.yazarAdi+"  Kitap Fiyati  " 
		+" "+each.kitapFiyati);
		}
	}

	public void adiIleArama (List<Book> kitaplar) {
		System.out.println("Lutfen aranan kitap adini giriniz");
		String kitapAdi = scan.nextLine();
		
		for (Book each :kitaplar) {
			if(kitapAdi.equals(each.kitapAdi)) {
				System.out.println("KitapNo  " +each.kitapNo.toString()+"  Kitap Adi  "+" "+ each.kitapAdi+ " "+"  Yazar Adi  "+ " "+each.yazarAdi+"  Kitap Fiyati  " 
								+" "+each.kitapFiyati);
			}
			
		}
	}
	
}
