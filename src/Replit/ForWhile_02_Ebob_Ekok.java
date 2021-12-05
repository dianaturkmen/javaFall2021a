package Replit;

public class ForWhile_02_Ebob_Ekok {

	public static void main(String[] args) {
		/*Ask user to enter 2 integer then find GCD (Greatest Common Divisor) and LCM (Least Common Multiple)

		Input :

		30 and 40

		Expected OutPut:

		GCD for 30 and 40 = 10

		LCM for 30 and 40 = 120
		*/
		
		int a=30;
		int b=40;
		int ekok=0;
		int max=a*b;
		int ebob = 0;
	        for(int i = 1; i < a; i++)
	        {
	            if(a % i == 0 && b % i == 0) {
	                ebob = i;
	            }
	        }
	        System.out.println("LCM for 30 and 40 = " + ebob);
		
		 for(int i = max; i > 0; i--)
	        {
	            if(i % a == 0 && i % b == 0) {
	                ekok = i;
	            }
	        }
	        System.out.println("GCD for 30 and 40 = " + ekok);
	}

}
