package day31_dateAndATime;

import java.time.LocalTime;

public class C02_LocalTime {

	public static void main(String[] args) {

	LocalTime saat=LocalTime.now();
	
	System.out.println("Baslangic saati"+saat);
		
		int sayi=10;
		for (int i=0; i<100000;i++);{
		
		
	}
		LocalTime saatBitis=LocalTime.now();
		System.out.println("Bitis saati"+saatBitis);
		
		
		double nano1=saat.getNano();
		double nano2=saatBitis.getNano();
		System.out.println("For loop  "+ (nano2-nano1)+"  nano saniyede tamamladi");
}
}