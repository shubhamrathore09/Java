package model;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private String state;
	private String city;
	private String picode;
	public Address(String state, String city, String picode) {
		super();
		this.state = state;
		this.city = city;
		this.picode = picode;
	}
	public Address() {
		super();
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPicode() {
		return picode;
	}
	public void setPicode(String picode) {
		this.picode = picode;
	}
	@Override
	public String toString() {
		return "Address [state=" + state + ", city=" + city + ", picode=" + picode + "]";
	}
	
	
	
}
