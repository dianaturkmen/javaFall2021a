package Homework;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sayi=6;
		int toplam=0;
		for(int i = 1; i < sayi; i++)
        {
            if(sayi % i == 0) {
                toplam += i;
            }
        }
        if(sayi == toplam) {
            System.out.println(sayi + " Mükemmel bir sayidir");
        }
        else {
            System.out.println(sayi + " Mükemmel bir sayi degildir.");
        }
    }
}	

