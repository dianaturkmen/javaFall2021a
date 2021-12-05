package Homework;

import java.util.Scanner;

public class sil {

	public static void main(String[] args) {
			Scanner scan = new Scanner (System.in);
				
				int sayi=0;
				int adet=0;
				int toplam=0;
				
				while (adet < 10 && toplam < 500 ) {
					
					System.out.println("Lutfen sayi giriniz : ");
					sayi=scan.nextInt();
					toplam+=sayi;
					adet++;
					
				
				}
				System.out.println(adet + " sayi girdiniz toplami " + toplam);
				}}

