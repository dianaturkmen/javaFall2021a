package Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Car {

		ThisKeyword(int x){

			this();

			System.out.println("Parametreli constructor");

		}

		ThisKeyword(){

			System.out.println("Parametresiz constructor");

		}	

		public static void main(String[] args) {

			ThisKeyword obj = new ThisKeyword(7);

		}


		
