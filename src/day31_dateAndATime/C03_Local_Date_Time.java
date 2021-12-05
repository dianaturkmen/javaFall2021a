package day31_dateAndATime;

import java.time.LocalDateTime;

public class C03_Local_Date_Time {

	public static void main(String[] args) {

		
		LocalDateTime tarihSaat=LocalDateTime.now();
		
		System.out.println(tarihSaat);
		
		
		System.out.println(tarihSaat.toString().startsWith("2021"));
		System.out.println();
		
	}

}
