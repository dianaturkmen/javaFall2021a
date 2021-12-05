package day31_dateAndATime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.TemporalAmount;

public class C01_LocalDate {

	public static void main(String[] args) {

		
		LocalDate tarih=LocalDate.now();
		
		System.out.println(tarih);
		
		System.out.println(tarih.getDayOfYear());
		System.out.println(tarih.getDayOfMonth());
		System.out.println(tarih.getDayOfWeek());
		System.out.println(tarih.getMonthValue());
		System.out.println(tarih.getMonth());
		
		System.out.println(tarih.plusDays(20));
		System.out.println(tarih.plusMonths(5));
		System.out.println(tarih.plusWeeks(15));
		System.out.println(tarih.plusYears(4));
		System.out.println(tarih.plusYears(10).plusMonths(10).plusDays(10));

		System.out.println(tarih.minusDays(20));
		System.out.println(tarih.minusWeeks(27));
		System.out.println(tarih.minusYears(5).minusMonths(5).minusDays(5));
		
		
		System.out.println(tarih.minusYears(21).isLeapYear());

		
		LocalDate dogumTarihi= LocalDate.of(1998, Month.APRIL, 23);
		LocalDate dogumTarihi1= LocalDate.of(1886, 11, 30);
		LocalDate dogumTarihi3= LocalDate.of(1985, 11, 30);

		
		
		System.out.println(dogumTarihi+ " "+ dogumTarihi1);
		
		System.out.println(dogumTarihi1.isAfter(dogumTarihi));
		System.out.println(dogumTarihi1.isBefore(dogumTarihi3));
		
		LocalDate dogumTarihi75= LocalDate.of(1975,06,18);

		LocalDate bugun= LocalDate.now();
		
		

		
		
	}

}
