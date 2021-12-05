package Replit;

public class ForWhile9_sayiTersCevir {

	public static void main(String[] args) {
		//Kullanıcının girdiği sayıyı tersine çeviren bir java programı yazınız. (Mulakat Sorusu)

		//Input :1238

		//Output :Girilen Numananin Tersi: 8321
		
		int sayi=1238;
		int tersSayi=0;
		
		while (sayi!=0) {
			tersSayi= 10*tersSayi+sayi%10;
			sayi /=10;
		}
		
	System.out.println("Sayinin tersi : " +tersSayi);
		
	}

}
