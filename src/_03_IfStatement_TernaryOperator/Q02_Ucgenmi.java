package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q02_Ucgenmi {

	public static void main(String[] args) {
	/*
	 *  Kullanicidan 3 tene pozitif  tam sayi alniz. 
	 *  bu uc sayinin ucgen olusturma durumunu kontrol ediniz
	    eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz
	     
	     üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük, herhangi iki kenar farkı diger kenardan büyük olmali
		 a+b>c>a-b
		 a+c>b>a-c  
	     b+c>a>b-c  
		a=b=c ise es kenar ucgen 
		 
	 */
   
        Scanner scan=new Scanner(System.in);
        System.out.print("Birinci kenari giriniz: ");
        int a=scan.nextInt();
        System.out.print("Ikinci kenari giriniz: ");
        int b=scan.nextInt();
        System.out.print("Ucuncu kenari giriniz: ");
        int c=scan.nextInt();

        if (a==b && b==c && c==a) {
        	System.out.println("Bu bir eskenar ucgendir.");
		}
        else {
	        	if (a+b>c && c>a-b && b+c>a && a>b-c && a+c>b && b>a-c){
	        	System.out.println("Bu bir ucgendir");
	        	}
	       
	        	else {
				
	        	System.out.println("Bu bir ucgen degildir");
	        	}

		}
        	
	
		
		
	

				

	}

}
