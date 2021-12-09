package projeler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class KitapMenu {

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
		 * count=1000;
		 * 
		 * menu isminde bir method olusturmaliyim,
		 * 
		 * 3-kitap ekle diye bir method olusturmliyim,
		 * 
		 * bu method farkli bir classda
		 * 
		 * 4-kullanicidn kitap adi yazar adi ve fiyat bilgileri istenmeli
		 */

		
		
		String menu = "";
		Scanner scan = new Scanner(System.in);
		long sayac=1000;
		Kutuphane kutuphane=new Kutuphane();
		List <Book> kitaplar=new ArrayList<>();
		
		
		

		do {
			System.out.println("***Lutfen yapmak istediginiz islemi seciniz***\n" + "\nYeni Kitap Ekleme-------------->1 "
					+ "\nNumara ile Kitap Arama---->2 " + "\nKitap Adi ile Arama------->3 "
					+ "\nKitap No'su ile Silme----->4 " + "\nTum Kitaplari Listele----->5" + "\nCikis----------------->6");
			menu = scan.nextLine();
			switch (menu) {
			case "1":
				kitaplar=kutuphane.kitapEkle(sayac);
			    sayac++;
				break;
				
			case "3":
				kutuphane.adiIleArama(kitaplar);
				break;
			case "2":
				kutuphane.noIleArama(kitaplar);
				break;
			case "4":
				kutuphane.noIleSilme(kitaplar);
				break;	
				
			case "5":
				System.out.println("Kitap Listesi");
				kutuphane.listele(kitaplar);
				
				break;
			/*
			 * case "2": numaraIleKitapArama(); case "3": kitapAdiIleKitapArama(); case "4":
			 * noIleKitapSilme(); 
			 * case "5": 
			 * tumKitapListele(); case "6": cikis();
			 */

			case "6":
				System.out.println("Cikis yapildi");
				break;
			default:
				System.out.println("Hatali  giris");
				break;
			}

		} while (!menu.equals("6"));
	}

}
