package HaftaninSorusu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in); 
		String islem;
		
		Kayit yeniKayit =new Kayit();
		List <Kullanici> kisi =new ArrayList<>();
		
		boolean cikilsinMi=false;
		while (!cikilsinMi) {
			System.out.println("Lutfen \n"+ "kisi eklemek icin --> 1"
			+"\nKisi listelemek icin--> 2"
			+"\nsansli kisi bulmak icin --> 3"
			+"\ncikis icin --> 4");
			islem=scan.next();
			
			switch (islem) {
			case "1":
				kisi=yeniKayit.kayitAl();
				break;
			case "2":
				yeniKayit.listele(kisi);
				break;
			case "3":
				yeniKayit.sansliKull(kisi);
				break;
			case "4":
				cikilsinMi=true;
				break;
			default:
				System.out.println("Hatali veri girdiniz");
				break;
			}
		}
		
	}

}
