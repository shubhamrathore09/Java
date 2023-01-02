package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Series extends Hotstar{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sid;
	private String name;
	private int numberOfEpisod;
	public Series(int userId, String name, int rating, Subcription subcription, int sid, String name2,
			int numberOfEpisod) {
		super(userId, name, rating, subcription);
		this.sid = sid;
		name = name2;
		this.numberOfEpisod = numberOfEpisod;
	}
	public Series(int userId, String name, int rating, Subcription subcription, String name2, int numberOfEpisod) {
		super(userId, name, rating, subcription);
		name = name2;
		this.numberOfEpisod = numberOfEpisod;
	}
	
	public Series( String name, int rating, Subcription subcription, String name2, int numberOfEpisod) {
		super( name, rating, subcription);
		name = name2;
		this.numberOfEpisod = numberOfEpisod;
	}
	
	
	
	public Series() {
		super();
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumberOfEpisod() {
		return numberOfEpisod;
	}
	public void setNumberOfEpisod(int numberOfEpisod) {
		this.numberOfEpisod = numberOfEpisod;
	}
	@Override
	public String toString() {
		return "Series [sid=" + sid + ", name=" + name + ", numberOfEpisod=" + numberOfEpisod + "]";
	}
}
