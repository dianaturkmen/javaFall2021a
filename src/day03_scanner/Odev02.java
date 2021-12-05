package day03_scanner;

import java.util.Scanner;

public class Odev02 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);

		// Soru 1) Kullanicidan iki tamsayi alip bu sayilarin toplam,fark ve
		// carpimlarini yazdirin

		
		 System.out.println("Lutfen birinci sayiyi giriniz: "); int
		 birinciSayi=scan.nextInt();
		 System.out.println("Lutfen ikinci sayiyi giriniz: "); int
		 ikinciSayi=scan.nextInt();
		 System.out.println("Toplam: "+(birinciSayi+ikinciSayi));
		 System.out.println("Fark: "+(birinciSayi-ikinciSayi));
		 System.out.println("Carpim: "+(birinciSayi*ikinciSayi));
		 

		// Soru 2) Kullanicidan karenin bir kenar uzunlugunu alin ve karenin cevresini
		// ve alanini hesaplayip yazdirin

		System.out.println("Karenin Kenar Uzunlugunu giriniz: ");
		int kareninKenarUzunlugu = scan.nextInt();
		System.out.println("Karenin Cevresi= " + (4 * kareninKenarUzunlugu));
		System.out.println("Karenin alani= " + (kareninKenarUzunlugu * kareninKenarUzunlugu));

		// Soru 3) Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini
		// hesaplayip yazdirin

		System.out.println("Yaricap degerini giriniz");
		int yaricap = scan.nextInt();
		System.out.println("Daire Cevresi= " + (2 * Math.PI * yaricap));
		System.out.println("Daire Alani= " + Math.PI * yaricap * yaricap);

		// Soru 4) Kullanicidan dikdortgenler prizmasinin uzun, kisa kenarlarini ve
		// yuksekligini isteyip prizmanin hacmini hesaplayip yazdirin

		System.out.println("Diktortgenler prizmanin uzun kenar giriniz");
		int uzunkenar = scan.nextInt();
		System.out.println("Diktortgenler prizmanin kisa kenar giriniz");
		int kisakenar = scan.nextInt();
		System.out.println("Diktortgenler prizmanin yuksekligini giriniz");
		int yukseklik = scan.nextInt();
		System.out.println("Diktortgenler prizmanin hacmi =" + (uzunkenar * kisakenar * yukseklik));

		/*
		 * Soru 5) Kullanicidan ismini ve soyismini isteyip asagidaki sekilde yazdirin
		 * Isminiz : Mehmet Soyisminiz : Bulut Kursumuza katiliminiz alinmistir,tesekkur
		 * ederiz
		 */

		System.out.println("Isminiz:");

		String isim = scan.next();

		System.out.println("Soyisminiz : ");

		String soyisim = scan.next();

		System.out.println("Isminiz: " + isim);
		System.out.println("Soyisminiz: " + soyisim);

		System.out.println("Kursumuza katiliminiz alinmistir,tesekkur ederiz");

		/*
		 * Soru 6) Kullanicidan ismini ve soyismini alip aralarinda bir bosluk
		 * olusturarak asagidaki sekilde yazdirin Isim – soyisim : Mehmet Bulutluoz
		 */

		System.out.println("Isim:");

		String isim1 = scan.next();

		System.out.println("Soyisim : ");

		String soyisim1 = scan.next();

		System.out.println("Isim - Soyisim: " + isim1 + " " + soyisim1);

		// Soru 7) Kullanicidan ismini alip isminin bas harfini yazdirin. */

		System.out.println("Adiniz:");

		String ad = scan.next();
		System.out.println("Ilk harfi: "+ ad.charAt(0));
	}

}
