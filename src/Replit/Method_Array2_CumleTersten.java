package Replit;

public class Method_Array2_CumleTersten {

	public static void main(String[] args) {
		//Write a Java program that reverse a sentence by using Array (with all spaces and special characters).

		//Input : Coding is greate.

		//Output : .etaerg si gnidoC
		
		String str="Coding is greate.";
		 String arr[]=str.split("");
		 String ters="";
		 for (int i=0; i<arr.length; i++){
		   ters+=arr[arr.length-1-i];
		 }
		 System.out.println(ters);
		   }
		}

