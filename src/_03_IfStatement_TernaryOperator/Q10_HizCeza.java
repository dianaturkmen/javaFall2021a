package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q10_HizCeza {
    public static void main(String[] args) {

    	/*
        Problem tanimi : 
      Kulaniciladan aracinizin hizini aliniz
      Trafik cezassinin degerini hesaplay�gn.
         
          45 hiz sinirlarindadir.
          Eğer hızınız 55-74 arasında ise:
          Ceza 100 $'dır.

          Eğer hızınız 75 - 84 arasında ise:
          Ceza 150 $'dır.

          Eğer hızınız 85 -94 arasında ise:
          Ceza 320 $'dır.

          Eğer hızınız 94'den daha fazla ise:
          Ceza 500 $'dır.

          ve ayrıca,
          Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.

          Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.

-----------------------------------------

          Örn;

          currentSpeed(Hızınız) 87
          ve isDriverLicenceAvailable(Ehliyeti var mı?) = true;

          sonuç 320 olmalıdır.

          currentSpeed(Hızınız) 65
          ve isDriverLicenceAvailable(Ehliyeti var mı?) = false;

          sonuç 300 olmalıdır.
   */
  	
  	Scanner scan=new Scanner(System.in);
  	System.out.println("Lutfen hizinizi giriniz:");
  	int hiz=scan.nextInt();
  	System.out.println("Hiz :"+hiz);
		
  	System.out.println("Ehliyetiniz var mi \nEvet icin E, Hayir icin H");
  	char ehliyet=scan.next().toUpperCase().charAt(0)	;			
		
		int ehliyetcezasi=0;
		int hizCezasi=0;
		if (ehliyet=='H') {
			System.out.println("Ehliyetsiz arac kullanma cezasi 200$ ");
			 ehliyetcezasi=200;
		}			 		
	    	
	
		 if ( hiz<54) {			    		
	    		hizCezasi=0;
	    	}
		 else if (hiz>=55 && hiz<=74) {			    		
	    		hizCezasi=100;
	    	}
	    else if (hiz>=75 && hiz<=84) {
	    	hizCezasi=150;
	    	}
	    else if (hiz>=85 && hiz<=94) {
	    	hizCezasi=320;
	    	}			    	
	    else  {
	    	hizCezasi=500;
	    	}

	   System.out.println("Ehliyet cezaniz" +ehliyetcezasi);
	   System.out.println("Hiz cezaniz" +hizCezasi);
	   System.out.println("Toplam cezaniz" +(hizCezasi+ehliyetcezasi));


	    
		  
}
}
