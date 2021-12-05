package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q06_Koordinat {
    public static void main(String[] args) {
        //// Kullanıcıdan aldığınız koordinat noktasının hangi bölgede olduğunu yazdıran bir kod yazınız.

    	Scanner scan=new Scanner(System.in);
    	
    	
    	System.out.println("X koordianti");
    	int x=scan.nextInt();
       
    	System.out.println("Y koordianti");
    	int y=scan.nextInt();
    	
    	//(sayi1>sayi2 ? sayi2 :sayi1)
    	System.out.println(  (x>0 && y>0) ? "1. Bolge" :
    									 ( (x<0 && y>0)? "2. Bolge" : 
    												   ((x<0 && y<0)? "3.bolge":
    																((x<0 && y<0)?"4.Bolge"
    																		     :""))      ))  ;
    			
    	

    

    
    	
    }
}
