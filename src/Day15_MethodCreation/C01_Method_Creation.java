package Day15_MethodCreation;

import java.util.Scanner;

public class C01_Method_Creation {

	public static void main(String[] args) {

		// kullanicidan ismini ve soyismini isteyin
				// iki farkli method olusturun methodlardan biri girilen kelimeleri
				//   ilk harf buyuk, digerleri kucuk olacak sekilde birlestirsin
				// Ikinci method Isim ve soyismin ilk harfleri buyuk harf,
				//   kalan harfler * olacak sekilde birlestirsin
				
				// kullaniciya isminin acik olarak yazilmasi veya gizlenmesi tercihi sorun
				// ve programin kalan ksminda isim ve soyismi kullanicinin istedigi sekilde kullanin	
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen isim ve soyisminizi girin \nisimden sonra entere basiniz  ");
		String isim=scan.next();
		String soyisim=scan.next();
		
		System.out.println("isminizi acik sekilde yazilmasini istiyorsaniz 1"
				+ "\nisminizi gizli yazilmasini istiyorsaniz 2'ye basin");
		
		int tercih=scan.nextInt();
		
		String birlesmisIsim=null;
		
		if (tercih==1) {
			birlesmisIsim=acikIsim(isim, soyisim);
		} else if (tercih==2) {
			birlesmisIsim=gizliIsim(isim, soyisim);
		}else
			System.out.println("Lutfen 1 veya 2  secin");
		
        System.out.println("kullanicinin tercihi : " + birlesmisIsim);


		
	}

	private static String gizliIsim(String isim, String soyisim) {
	
	isim=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
	soyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\w","*");
	
	return isim +" "+ soyisim;

	}

	
	
	private static String acikIsim(String isim, String soyisim) {
		isim=isim.substring(0,1).toUpperCase() +isim.substring(1).toLowerCase();
		
		return isim +" "+ soyisim;
		
	}

}
