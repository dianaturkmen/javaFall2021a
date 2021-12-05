package Replit;

import java.util.Arrays;

public class Method_Array_8_ArrayBirlestirme {

	public static void main(String[] args) {
		/*Write a return method that accepts 2 integer Arrays as parameters 
		 * And adds 2 array into a new Array and prints it.

				Input1={1,2,3,4}

				Input2={5,6}

				Output={1,2,3,4,5,6}
				*/
		
		
		int dizi1[]= {1,2,3,4};
		int dizi2[]= {5,6};
		int Dizi3[]= new int [dizi1.length+dizi2.length];

		Dizi3=diziBirlestir(dizi1,dizi2);
		
		System.out.println(Arrays.toString(Dizi3));
		
		
}

	private static int[] diziBirlestir(int[] dizi1, int[] dizi2) {
		// TODO Auto-generated method stub
			int yeniDizi[]= new int [dizi1.length+dizi2.length];

		for (int i = 0; i < dizi1.length; i++) {
			yeniDizi[i]=dizi1[i];
		}
		for (int i = 0; i < dizi2.length; i++) {
			yeniDizi[dizi1.length+i]=dizi2[i];
			
		}
		return yeniDizi;
	}
}
	
