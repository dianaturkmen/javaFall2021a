package Javapractice01;

import java.util.Scanner;

public class PracticeSoru3 {

	public static void main(String[] args) {
//Kullanici ad soyad yas boy kilo alt alta yazdirin
		Scanner scan=new Scanner (System.in);
		
		System.out.print("Adinizi girin: ");
		//print ayni satira yazdirir, ln yazilirsa alt satira yazdirir.
		String name=scan.next();
	
		System.out.print("Soyadinizi girin: ");
		String surname=scan.next();
		
		System.out.print("Yasinizi girin: ");
		int yas=scan.nextInt();
		
		System.out.print("Boyunuzu girin: ");
		int boy=scan.nextInt();
		
		System.out.print("kilonuzu girin: ");
		int kilo=scan.nextInt();
		
System.out.println("Adim:  " + name +"\n"+"Soyadim:  "+surname + "\n"+"Yasim "+ yas+ "\n"
		+"Boyum:  "+boy +"  cm"+ "\n"+"Kilom:  "+ kilo +"  Kg");	






 




		
		
		
				
				
		
	}

}
