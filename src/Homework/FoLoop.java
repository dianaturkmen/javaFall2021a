package Homework;

import java.util.Scanner;

public class FoLoop {

	public static void main(String[] args) {
 //Kullanicidan pozitif bir rakam isteyin ve girilen rakama gore asagidaki sekli cizdirin
		/*
		*
		**
		***
		**** 
		*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir pozitif sayi giriniz:");
		int sayi=scan.nextInt();
		
		for (int i = 1; i < sayi; i++) {
		System.out.println("");	
		
		for (int j = 1; j <i; j++) {
			System.out.print(" *");
			
			
			
			
		}
		}
		
		
		
	}

}
