package model;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ItemOrders {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int iid;
	private String itemName;
	
	
	private LocalDateTime dateTime;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private Order order;

	public ItemOrders(int iid, String itemName,  LocalDateTime dateTime, Order order) {
		super();
		this.iid = iid;
		this.itemName = itemName;
		
		this.dateTime = dateTime;
		this.order = order;
	}

	public ItemOrders(String itemName, LocalDateTime dateTime, Order order) {
		super();
		this.itemName = itemName;
		this.dateTime = dateTime;
		this.order = order;
	}
	
	public ItemOrders(String itemName) {
		super();
		this.itemName = itemName;
		
	}

	public ItemOrders() {
		super();
	}

	public int getIid() {
		return iid;
	}

	public void setIid(int iid) {
		this.iid = iid;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "ItemOrders [iid=" + iid + ", itemName=" + itemName + ", dateTime=" + dateTime + "]";
	}
	
	
	
	
	
}
