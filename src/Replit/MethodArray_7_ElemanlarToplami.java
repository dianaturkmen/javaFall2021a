package Replit;

public class MethodArray_7_ElemanlarToplami {

	public static void main(String[] args) {
		/*Write a method that accepts an array as parameter and 
		 * returns sum off all elements in the array Then print the result in the main method.

		Eg :

		input : {1,2,3,4,5,6,7,8};

		output: 36*/
		
	

		int arr[]={1,2,3,4,5,6,7,8};
		int toplam=0;
		
		toplam=elemanToplama(arr);
		System.out.println(toplam);
		

	}

	private static int elemanToplama(int[] arr) {
		// TODO Auto-generated method stub
		int geciciToplam=0;
		for (int i = 0; i < arr.length; i++) {
			geciciToplam=geciciToplam+arr[i];
		}
		
		
		
		return geciciToplam;
	}

}
