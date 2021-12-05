package day28_ConstructorCAll_staeicKey;

public class C01 {

		// TODO Auto-generated method stub

int x = 3 ; 

    int y = 5 ;

    C01(){

        x+=1 ;

        System.out.println("-x"+x);

    }

    C011(int i){

     this();

     this.y = i ; 

     x+=y ;

        System.out.println("-x"+x);

    }

    C01(int 1 , int 12){
        this(3);
        this.x-=4 ;
        System.out.println("-x"+x);

    }

    public static void main(String[]args) {
    	C011 c01=new C011(4,3);
    }

    }	

