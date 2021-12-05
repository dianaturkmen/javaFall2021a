package day18_nestedforLoop_whileLoop;

import java.util.Scanner;

public class C06_WhileLoop {

	public static void main(String[] args) {

		/*
		 * Kullanicidan toplanmak uzere sayilar isteyin Sayi adedi 10 u gecerse veya
		 * toplam 500 u gecerse "bu kadar sayi yeter" " ...adet sayi girdin, toplami..."
		 * yazdirin
		 */

		Scanner scan = new Scanner(System.in);
		int sayi = 0;
		int toplam = 0;
		int sayac = 0;

		while ((sayac <10) && (toplam <= 500)) {
			System.out.println("toplanmak uzere "+ (sayac+1) +". sayiyi giriniz");
			sayi = scan.nextInt();
			toplam += sayi;
			sayac++;

		}
		System.out.println("bu kadar sayi yeter");

		System.out.println(sayac + " adet sayi girdin, toplami  : " + toplam);

	}

}
