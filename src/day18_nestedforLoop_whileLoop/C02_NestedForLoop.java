package day18_nestedforLoop_whileLoop;

import java.util.Scanner;

public class C02_NestedForLoop {

	public static void main(String[] args) {

		//Kullanicidan 10 dan kucuk bir pozitif tam sayi girmsini isteyin
		//girdigi sayiya gore asagidaki sekli yaazdirin.
		//1
		//12
		//123
		
		  Scanner scan = new Scanner(System.in);
	        System.out.println("lutfen 10 dan kucuk bir pozitif  sayi girin...");
	        int sayi = scan.nextInt();
	        
		
	        for (int satir = 1; satir <= sayi; satir++) {
				
	            for (int i = 1; i <= satir; i++) {
	    			System.out.print((i + " "));
	    			
	    		}
	    	      System.out.println();
			}
	        
	  
	        
		scan.close();
		
		
	}

}
