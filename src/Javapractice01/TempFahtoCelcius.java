package Javapractice01;

import java.util.Scanner;

public class TempFahtoCelcius {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen sicaklik degerini Fahrenheit olarak giriniz");
		int sicaklikFah=scan.nextInt();
		int sicaklikCelsius=(sicaklikFah-32)*5/9;
		
		System.out.println("Santigrat derece degeri :" + sicaklikCelsius);
		
	}

}
