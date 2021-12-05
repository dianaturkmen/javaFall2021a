package Homework;

import java.util.Scanner;

public class TernaryOdev1 {

	public static void main(String[] args) {
//Kullanicidan bir tam sayi alin ve sayinin tek veya cift oldugunnu yazdirin
		
		Scanner scan=new Scanner(System.in)	;	
		System.out.println("Lutfen bir sayi giriniz");
		int sayi=scan.nextInt();
		System.out.println(sayi%2==0 ? "Sayi cift" : "Sayi Tek");
		

	}

}
