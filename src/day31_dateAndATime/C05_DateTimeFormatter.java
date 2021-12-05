package day31_dateAndATime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C05_DateTimeFormatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LocalDateTime tarihSaat=LocalDateTime.now();

System.out.println(tarihSaat);

//Eger tarih veya ssati kendi istedigimiz bicimde yazdiramk istersek 
//gun /ay / yil  saat:dakika

DateTimeFormatter duzenle= DateTimeFormatter.ofPattern("d / M / EEE YYYY  HH : mm");
System.out.println(duzenle.format(tarihSaat));

	}

}
