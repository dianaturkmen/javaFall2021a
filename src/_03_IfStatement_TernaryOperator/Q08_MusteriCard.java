package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q08_MusteriCard {
	/*
	 * Problem tanimi : 
	 * 
	 * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
	 * musteri karti olup olmadigini sorun
	 * 
	 * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin 
	 * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
	 * alirsa %10 indirim yapin
	 */
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Urun Adedi Giriniz:");
		int adet=scan.nextInt();
		System.out.println("Liste Fiyatini Giriniz:");
		double lfiyat=scan.nextDouble();
		System.out.println("Musteri kartiniz var mi E/H ?" );
		char Kart=scan.next().toUpperCase().charAt(0);
		
		double urunFiyati=adet*lfiyat;
		System.out.println("Urun liste fiyati:" +urunFiyati);
		if (Kart=='E') {
			if (adet>10) {				
				System.out.println("Urunun %20 ind. Fiyati :" +  (urunFiyati*80/100));
				 
			}
			else {
				System.out.println("Urunun %15 ind. Fiyati :" +  (urunFiyati*85/100.0))	;
			}
		}
		else {
			if (adet>10) {
				System.out.println("Urunun %15 ind. Fiyati :" +  (urunFiyati*85/100));				
			}
			else {
				System.out.println("Urunun %10 ind. Fiyati :" +  (urunFiyati*90/100));	
			}
		}		
		
		

}
}
