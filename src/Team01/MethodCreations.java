package Team01;

import java.util.Scanner;

public class MethodCreations {


	    public static void main(String[] args) {
	    	// Kullanicidan bir sayi alin. 
	    	//Bu sayinin tek mi cift mi oldugunu, 
	    	//sifirdan buyuk mu kucuk mu oldugunu, 
	    	//ayrica ve 100’den buyukse birler, onlar ve yuzler basamagindaki rakamlarin toplamini,
	    	//100’den kucukse sadece 1’ler basamagini yazdiran 3 method olusturun.
	    	        
	    	        Scanner scan = new Scanner(System.in);
	    	        System.out.println("Lutfen bir sayi girin");
	    	        int s = scan.nextInt();
	    	        sBK(s);
	    	        
	    	        
	    	 
	    	        boy(s);
	    	        
   	        
	    	    }
	    	    public static void boy(int s) {
			// TODO Auto-generated method stub
			
		}
				public static void sBK(int s) {
	    	        if (s>0) {
	    	            System.out.println("Sayi sifirdan buyuktur");
	    	        } else if(s<0){
	    	        }else {
	    	            
	    	        }
	    	        
	    	    }
	    	    public static void tC(int s) {
	    	        if (s%2==0) {
	    	            System.out.println("bu sayi cifttir");
	    	        }else {
	    	            System.out.println("bu sayi tektir");
	    	        }
	    	    }
	    
		
		
		
		
	}


