package HaftaninSorusu;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kayit {

	List <Kullanici> kisiler=new ArrayList<>();
	public List<Kullanici> kayitAl(){
		Scanner scan =new Scanner(System.in);
		System.out.println("Adinizi giriniz");
		String isim=scan.nextLine();
		
	   Kullanici user=new Kullanici(isim, LocalDateTime.now());

		kisiler.add(user);
		return kisiler;
	}

	public void sansliKull(List<Kullanici>kull) {
		for (Kullanici each  :kull ) {
			if (each.kayitZamani.getSecond()<10) {
				System.out.println("sansli kisisiniz"+each.name);
			}else System.out.println("maalesef sansli degilsiniz" +each.name);
			}
	}
	public void  listele (List<Kullanici>kul) {
		for (Kullanici each : kul) {
			System.out.println("Adi :" + each.name+ "kayit zamani :"+ each.kayitZamani);
		}
	}
	}
	
	

