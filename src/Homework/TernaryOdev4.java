package Homework;

import java.util.Scanner;

public class TernaryOdev4 {

	public static void main(String[] args) {

		//Kullanicidan bir sayi alin. Sayi pozitif ise Sayi Pozitif yazdirin,
		//negatifse sayinin karesini yazdirin.
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir sayi giriniz ");
		int sayi=scan.nextInt();
		System.out.println(sayi>0 ?"Sayi pozitif" : "Sayi negatift");
		
		
	}

}
