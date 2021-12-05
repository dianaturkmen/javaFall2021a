package Replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Method_Array6_MaxMin {

	public static void main(String[] args) {
		
	
		/*Write a method that accepts an integer array as input and 
		 * prints the minimum and the maximum numbers from given array

		Input : {3,2,5,4,1,6}

		Output :

		min: 1

		max: 6*/

		int arr[]={3,2,5,4,1,6};
		
		dizininMinMaxyYazdir(arr);
		
		
	}

	private static void dizininMinMaxyYazdir(int[] arr) {
		Arrays.sort(arr);
		System.out.println("min: " + arr[0] + " \nmax: "+           arr[arr.length-1]);
		
		
	}

}
