package model;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

@Inheritance(strategy = InheritanceType.JOINED)

public class Hotstar {

	private int  userId;
	private String name;
	private int rating;
	@Enumerated
	private Subcription subcription;
	public Hotstar(int userId, String name, int rating, Subcription subcription) {
		super();
		this.userId = userId;
		this.name = name;
		this.rating = rating;
		this.subcription = subcription;
	}
	public Hotstar(String name, int rating, Subcription subcription) {
		super();
		this.name = name;
		this.rating = rating;
		this.subcription = subcription;
	}
	public Hotstar() {
		super();
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public Subcription getSubcription() {
		return subcription;
	}
	public void setSubcription(Subcription subcription) {
		this.subcription = subcription;
	}
	@Override
	public String toString() {
		return "Hotstar [userId=" + userId + ", name=" + name + ", rating=" + rating + ", subcription=" + subcription
				+ "]";
	}
	
}
