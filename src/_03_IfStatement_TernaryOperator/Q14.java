package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q14 { 
	
	public static void main(String[] args) {

	/* Günün sorusu: if statement
      katsayıları verilen 2 bilinmeyenli denklemin kökleriniz bulunuz.

        ax^2 + bx + c;

        Çözüm adımları
        kullanıcıdan a,b,c yi okutun.
        Delta = bb - 4ac
        Delta > 0 => 2 tane kök vardır x1=(-b + kök(d)) / (2a)  , x2= (-b - kök(d)) / (2*a)
        Delta = 0 => 1 tane kök vardır x = -b/2a
        Delta < 0 ise kök yoktur.
   */
    
		Scanner scan=new Scanner(System.in);
	  	System.out.println("a:");
	  	int a=scan.nextInt();
	  	System.out.println("b");
	  	int b=scan.nextInt();
	  	System.out.println("c");
	  	int c=scan.nextInt();
	
	  	int delta=b*b-(4*a*c);
	
	  	System.out.println(delta);
	  	if (delta<0) {
			System.out.println("kok yoktur. delta=" + delta);
		}
	  	else if (delta==0) {
	  		double x=-1*b/2*a;
			System.out.println("1 tane kok  vardir x=" + x );
		}
	  	else {
	  		 double x1 = ((-1*b) + Math.sqrt(delta)) / (2*a);
	  	
	  		double x2=((-1*b) - Math.sqrt(delta)) / (2*a);
	  		System.out.println("iki tane kok vardir" + x1 + " ,"+ x2);
	  	}
	  	
	}	
	
}
