package Replit;

public class Method_Array3_SayiBulDegerToplama {

	public static void main(String[] args) {

		/*Write a method which accepts a String as parameter and prints the sum of the digits, present in the given string.

		input : ade1r4d3

		output : 8

		     Hint :
		     Use Character.isDigit()
		     Integer.valueOf()
		     */
			
	 	String arr[]= {"a","d","e","1","r","4","d","3"};
		
			int Toplam=0;
			
			Toplam=dizininElemanlariniTopla(arr);
			
			System.out.println(Toplam);

		}

		private static int dizininElemanlariniTopla(String[] arr) {
			// TODO Auto-generated method stub
			int toplam=0;
			for (int i = 0; i < arr.length; i++) {
				if (Character.isDigit(arr[i].charAt(0))) {
					toplam+=Integer.valueOf(arr[i]);
							
				}
			}
			
			return toplam;
		}
	}
