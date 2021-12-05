package Homework;



public class test {

	public static void main(String[] args) {
	     

	
		//'a' ile 'z' arasındaki karakterlerin ascii değerlerini yazdıran bir Java programı yazın.	
		
		/*Sayinin Mükemmel sayı olup olmadığını kontrol eden Java kodunu yazın.

		Sayının kendisi hariç pozitif bölenlerinin toplamı o sayıya eşitse, herhangi bir sayı Mükemmel Sayı olarak bilinir.
		Input :

		6

		Output:

		6 Mukemmel Sayidir.

		======================

		Input

		7

		Output:

		7 Mukemmel Sayidir degildir. */
		
		int sayi=6;
		int toplam=0;
		
		for (int i = 0; i < sayi; i++) {
			if (sayi%i==0) {
				toplam+=sayi;
			}
		}
		if (toplam==sayi) {
			System.out.println(sayi + "  Mukkemel sayidir");
		}
		System.out.println(sayi + "  Mukkemel sayi degildir");

	}
}
