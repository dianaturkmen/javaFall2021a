package HaftaninSorusu;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Kullanici {

	
	String name;
	LocalDateTime kayitZamani;
	public Kullanici () {	
	}
	
	public Kullanici (String name, LocalDateTime registerDate) {
	this.name=name;
	this.kayitZamani=registerDate;
	}

	
}
