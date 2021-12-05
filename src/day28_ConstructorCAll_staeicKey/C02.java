package day28_ConstructorCAll_staeicKey;

public class C02 {
int x=5;
static int y=10;

	
	
	public static void main(String[] args) {
// tane obje olusturalim ve degisimleri gozlemleyim
		
		C02 obje1=new C02();
		
		System.out.println("obje1 icin x:  "+obje1.x +"  obje1 icin y:   "+ obje1.y);
		
		obje1.x++;
		obje1.y++;
		
		System.out.println("islemden sonra obje1 icin x: "+obje1.x +"  obje1 icin y: "+ obje1.y);
		C02 obje2=new C02();
		System.out.println("obje1 icin x:  "+obje2.x +"  obje1 icin y:   "+ obje2.y);

		obje2.x++;
		obje2.y++;
		System.out.println("islemden sonra obje1 icin x: "+obje2.x +"  obje1 icin y: "+ obje2.y);

		System.out.println("obje2 olusturuldukatn ve islemden sonra x "+ obje2.x +"y"+obje1.y);
		
		C02 obje3 = new C02();
		obje3.x=20;
		obje3.y=40;
		System.out.println("obje3 den sonra : "+obje3.x +"  obje1 icin y: "+ obje3.y);

	}

}
