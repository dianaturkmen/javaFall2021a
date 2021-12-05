package Homework;

public class socrates {

	public static void main(String[] args) {
	
		
		
        Scanner scan = new Scanner(System.in);

        System.out.print("bir metin giriniz : ");

        String  str = scan.nextLine();

        int index=0;

        do {

            if (index%2==1){

                System.out.print(str.charAt(index)+" ");

            }

            index++;

        }while(index<str.length());

    }

}


	}

}
	
