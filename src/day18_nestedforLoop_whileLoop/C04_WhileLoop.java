package day18_nestedforLoop_whileLoop;

import java.util.Scanner;

public class C04_WhileLoop {

	public static void main(String[] args) {

		// kullanicidan toplanmak uzere sayi isteyin
				// kullanici sifira basincaya kadar sayilari alip
				// toplamaya devap edin
				// kullanici sifira bastiginda,
				// o ana kadar kac sayi girdigini ve girilen sayilarin toplamini yazdirin
		
		
		Scanner scan=new Scanner(System.in);
		// loop un icinde kullanacagim obje ve variablelari 
		//loop tan once olusturmak daha guzeldir
		//loop un icinde olusturursak ,
		//loop her dondugunde yeni bir obje olusturur ve bu da hafizayi doldurur.
		
		int sayi=1;
		int toplam=0;
		int sayac=0;
		
		while (sayi!=0) {
			System.out.println("lutfen toplama eklemek icin bir tam sayi yazin \nbitirmek icin 0'a basin" );
			sayi=scan.nextInt();
			toplam+=sayi;
			sayac++;
		}
		// kullanici 0'a bastiginda loop islevini son kez yapip
		// sonra basa donecek ve loop bitecek
		// o i toplanmak uzere vwrilmeyip sadece bitirmek uzere verildiginden
		// sifiri sayaca eklememek ici sayac-1 yaptik
		System.out.println( "girilen sayi adedi " +(sayac-1));
		System.out.println( "girilen sayi toplami " +toplam);

		
	}

}
