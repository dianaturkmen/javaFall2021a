package Team01;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		/*Soru 5.  Problem Tanımı
        Kullanıcıdan üç adet sayı alarak bu sayıların
        bir dik üçgenin kenar uzunlukları olup olmadığını hesaplatan bir kod yazınız
        (Yardım: Bir üçgenin dik olduğunu anlamak için a2+b2=c2 pisagor
        bağlantısından yararlanabilirsiniz)
        Örnek Ekran Çıktısı
        birinci kenarı giriniz: 2
        ikinci kenarı giriniz 15
        üçüncü kenarı giriniz: 7
        Bu bir dik üçgen değildir.
        Bu bir dik üçgendir */
        
        
        Scanner scan=new Scanner(System.in);
        System.out.print("Birinci kenari giriniz: ");
        int a=scan.nextInt();
        System.out.print("Ikinci kenari giriniz: ");
        int b=scan.nextInt();
        System.out.print("Ucuncu kenari giriniz: ");
        int c=scan.nextInt();

        //a2+b2=c2 
        if ((a*a)+(b*b)==c*c) {
        	System.out.println("Bu bir dik ucgendir");
			
		} else {
			
        	System.out.println("Bu bir dik ucgen degildir");

		}
        	
	

}
}
