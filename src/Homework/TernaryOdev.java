package Homework;

import java.util.Scanner;

public class TernaryOdev {

	public static void main(String[] args) {

        // Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin
		
Scanner scan=new Scanner(System.in)	;	
	System.out.println("Lutfen 1. sayiyi giriniz");	
	int a=scan.nextInt();
	System.out.println("Lutfen 2. sayiyi giriniz");	
	int b=scan.nextInt();
	
	System.out.println(a<b ? "1. sayi kucuktur." : "2. sayi kucuktur.");


		
	}

}
