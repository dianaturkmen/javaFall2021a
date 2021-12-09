package projeler;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Kitapci {

	static ArrayList<Kitap> kitaplik = new ArrayList<Kitap>();
	static int sayac = 1000;
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		/*
		 * ====================PAZAR PROJEMIZ============================== bir kitapci
		 * icin program yazalim kitap no 1000'den baslayacak sirali no olsun program
		 * baslayinca menu isminde bir method calissin 1-kitap ekle 2-numara ile kitap
		 * goruntule 3-bilgi ile kitap goruntule 4-numara ile kitap sil 5-tum kitaplari
		 * listele 6-cikis
		 ************************************
		 * 1.olarak her kitaba ait kitap no olacak, sonra kitap adi olacak, buna ait
		 * yazar adi olacak ve kitap fiyati olacak bu bilgilerin tutulacagi bir yer
		 * olmali yani bir list'te tutmamiz gerek 2-kitap numarasi 1000'den
		 * baslamali,her kitap eklendiginde bir artacagi icin sayac gibi dusunulebilinir
		 * count=1000; menu isminde bir method olusturmaliyim, 3-kitap ekle diye bir
		 * method olusturmliyim,bu method farkli bir classda 4-kullanicidn kitap adi
		 * yazar adi ve fiyat bilgileri istenmeli
		 */
		
		 ilkKitaplar(5); // istersek ilk deger olarak 5 kitap ekleyebiliriz.
		 
		String menu ="";	 
		do {
			System.out.println("***Lutfen yapmak istediginiz islemi seciniz***\n" + "\nYeni Kitap Ekleme       : 1 "
					+ "\nNumara ile Kitap Arama  : 2 " + "\nKitap Adi ile Arama     : 3"
					+ "\nKitap No'su ile Silme   : 4" + "\nTum Kitaplari Listele   : 5 "
					+ "\nCikis                   : 6 ");
			menu=scan.nextLine();
			//scan.nextLine(); 
			//System.out.println(menu);
			switch (menu) {
			case "1":
				kitapEkle();
				break;
			case "2":
				if (kitaplik.isEmpty()) {
					System.out.println("Kitaplikta hic kitap yok.");
				}
				else kitapNoArama();				
				break;
			case "3":
				if (kitaplik.isEmpty()) {
					System.out.println("Kitaplikta hic kitap yok.");
				}
				else kitapAdiArama();	
				break;
			case "4":
				if (kitaplik.isEmpty()) {
					System.out.println("Kitaplikta hic kitap yok.");
				}
				else kitapNoSilme()	;
				break;
			case "5":
				kitapListele()	;
				break;	
			default:
				break;
			}
		} while (!menu.equals("6"));
		System.out.println("Cikildi.");

	}
	
	private static void kitapListele() {
		if (!kitaplik.isEmpty()) {
			System.out.println("Kitap Listesi ");
			for (Kitap kitap : kitaplik) {
			  	kitap.kitapyaz();	 
			}
		}
		else System.out.println("Kitaplik bos.");
			
	}
	private static void kitapNoSilme() {
	  	long arananKitapNo =0;
		String soru="";
		Kitap silinecekKitap=new Kitap();
		    System.out.println("\nSilinecek Kitap No Giriniz");
			arananKitapNo = scan.nextLong();
			scan.nextLine();
			for (Kitap kitap : kitaplik) {
				if (kitap.getKitapNo()==arananKitapNo) {
					silinecekKitap=kitap;					
					break; //dongu icinde silinemiyor, once donguden cikalim ve sonra bulunan kitabi sileriz.
				}
			}		
			
			if (!silinecekKitap.getKitapAdi().isEmpty()) {
			//kitap silinecekse burada dongu sonrasi silelim.
			silinecekKitap.kitapyaz(); //kitabin bilgilerini gosterir.
			kitaplik.remove(silinecekKitap);
			}
			else
				System.out.println("kitap bulunamadi.");
		 
	}
	private static void kitapAdiArama() {
		System.out.println("\nAranan Kitap Adi Giriniz");
		String arananKitap = scan.nextLine();
		
		for (Kitap kitap : kitaplik) {
				if (kitap.getKitapAdi().equals(arananKitap)) {
					kitap.kitapyaz(); //kitap bulundu ise cikalim v 
					return; 
				}			
		}
		System.out.println(arananKitap + " adli kitap bulunamadi");	
			
	}
	private static void kitapNoArama() {
		 
		long arananKitapNo =0;
		 
		System.out.println("\nAranan Kitap No Giriniz ");
		arananKitapNo = scan.nextLong();
		scan.nextLine();
		for (Kitap kitap : kitaplik) {
				if (kitap.getKitapNo()==arananKitapNo) {
					kitap.kitapyaz();
					return;
				}
		}
		System.out.println(arananKitapNo+" numarali Kitap bulunamadi.");
		 
	}

	private static void kitapEkle() {
 
		String kitapAdi = "";
		String yazarAdi = "";
		double kitapFiyati = 0.0;
		do {
			System.out.println("\nKitap Adini Giriniz, Vazgecmek icin Enter'a  basiniz");
			kitapAdi = scan.nextLine();
			if (kitapAdi.equals("")) {
				System.out.println("vazgecildi.\n");
				break;
			}

			System.out.println("Yazar Adini Giriniz");
			yazarAdi = scan.nextLine();

			System.out.println("Kitap Fiyatini Giriniz");
			kitapFiyati = scan.nextDouble();
			scan.nextLine();

			Kitap yeniKitap = new Kitap();

			yeniKitap.setKitapAdi(kitapAdi);
			yeniKitap.setYazarAdi(yazarAdi);
			yeniKitap.setKitapFiyati(kitapFiyati);
			yeniKitap.setKitapNo(sayac++);
			kitaplik.add(yeniKitap);
		} while (!kitapAdi.equals(""));	 	
	}

	
	//baslangic degerleri icin random kitaplar ekleyelim.
	private static void ilkKitaplar(int i) {
		Kitap yeniKitap ;
		LocalTime tarih=LocalTime.now();
		for(int j=0;j<=i;j++) {
			yeniKitap = new Kitap();
			
			yeniKitap.setKitapAdi("kitap_"+j );
			yeniKitap.setYazarAdi("Yazar_" +j );
			yeniKitap.setKitapFiyati(10*+j);
			yeniKitap.setKitapNo(sayac++);
			kitaplik.add(yeniKitap);
		} 
		
	}

}
