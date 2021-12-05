package day31_dateAndATime;

import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

public class C04_DateTime {
 
	public static void main(String[] args) {

		//Bir srtrin ve bir int variable olusturulim
		// Bir loop iceririnde bu variable lari 1000 kere degisitirelim
		// ve islem surelerini kiyaslayalim
		
		// verilen iki dogu tarihinin hangisinin daha once oldugunu bulunuz
		
		LocalTime saat=LocalTime.now();
		
		System.out.println("Baslangic saati"+saat);
			
			String str="Cemile";
			for (int i=0; i<100000;i++);{
			str+=" ";
			
		}
			LocalTime saatBitis=LocalTime.now();
			System.out.println("Bitis saati"+saatBitis);
			
			
			double nano1=saat.getNano();
			double nano2=saatBitis.getNano();
			System.out.println("For loop  "+ (nano2-nano1)+"  nano saniyede tamamladi");
		
			System.out.println(saat.getMinute());
			System.out.println(saat.plusMinutes(10000));
			System.out.println(saat.minusHours(14000));
			
			LocalTime yerelSaat= LocalTime.now(ZoneId.of("Turkey"));
			System.out.println(yerelSaat);
			

			
			
			
	}

}
