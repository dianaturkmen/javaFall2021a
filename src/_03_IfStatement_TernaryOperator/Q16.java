package _03_IfStatement_TernaryOperator;
import java.util.Scanner;

public class Q16 {
/*
    Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve 
    en kucuk olanlarini konsola yazdiriniz
    int num1 
    int num2 
    int num3
*/
    
    public static void main(String[] args) {
        
       
    	Scanner scan=new Scanner(System.in);
    	System.out.println("1.sayiyi giriniz");
    	int a=scan.nextInt();
    	System.out.println("2.sayiyi giriniz");
    	int b=scan.nextInt();
    	System.out.println("3.sayiyi giriniz");
    	int c=scan.nextInt();
    	
    	if (a<b && a<c ) {
			System.out.println(a);
			
		} 
    	else if (b<a && b<c) {
			System.out.println(b);
    		
    		
		}
    	else  {
    		System.out.println(c);
		}
    	
    	
    	
    }
}

