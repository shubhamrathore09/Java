package model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "orderList")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int oid;
	
	private String address;
	private int amount;
	private LocalDateTime dateTime;
	
	@OneToMany(mappedBy = "order",cascade =  CascadeType.ALL)
	private List<ItemOrders> list;

	public Order(int oid, String address, int amount, LocalDateTime dateTime, List<ItemOrders> list) {
		super();
		this.oid = oid;
		this.address = address;
		this.amount = amount;
		this.dateTime = dateTime;
		this.list = list;
	}
	
	public Order( String address, int amount, LocalDateTime dateTime, List<ItemOrders> list) {
		super();
		
		this.address = address;
		this.amount = amount;
		this.dateTime = dateTime;
		this.list = list;
	}
	
	public Order() {
		super();
	
	}

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public List<ItemOrders> getList() {
		return list;
	}

	public void setList(List<ItemOrders> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Order [oid=" + oid + ", address=" + address + ", amount=" + amount + ", dateTime=" + dateTime
				+ ", list=" + list + "]";
	}
	
	
	
}
