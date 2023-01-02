package hash_A_Mapping;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private String city;

	public Address(String city) {
		super();
		this.city = city;
	}
	
	public Address() {
	
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
}
