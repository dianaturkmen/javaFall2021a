package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		/*
		 *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
		 *
		BMI = kilo(kg) /(boy*boy)(cm)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz 
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		
		 */
Scanner scan=new Scanner(System.in);
System.out.println("Kilonuzu giriniz:");
double kilo=scan.nextDouble();
System.out.println("Boyunuz giriniz:");
double boy=scan.nextDouble();

double VKI=kilo/(boy/100*boy/100);
System.out.println(VKI);

if (VKI<=20) {
	System.out.println("oldukca zayifsiniz");
}


else if(20<VKI && VKI<=25) {
	System.out.println("Normalsin");
}
else if(25<VKI && VKI<=30) {
	System.out.println("sismansin");
}

else if(30<VKI) {
	System.out.println("sismansin");
}


    }

}
