package model;


import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	private String name;
	private String mobileNumber;
	private String email;
	
	@Embedded
	@ElementCollection(fetch = FetchType.EAGER)
	private List<Address> address;

	public Customer(int cid, String name, String mobileNumber, String email, List<Address> address) {
		super();
		this.cid = cid;
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.address = address;
	}

	public Customer(String name, String mobileNumber, String email, List<Address> address) {
		super();
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.address = address;
	}
	
	

	public Customer() {
		super();
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", mobileNumber=" + mobileNumber + ", email=" + email
				+ ", address=" + address + "]";
	}
}
