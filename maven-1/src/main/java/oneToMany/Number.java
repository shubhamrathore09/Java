package oneToMany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="number")
public class Number {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int nid;
	private String name;
	@Enumerated(EnumType.STRING)
	private NumberType type;


	public Number(int nid, String name, NumberType type) {
		super();
		this.nid = nid;
		this.name = name;
		this.type = type;
//		this.pid = pid;
	}
	
	public Number( String name, NumberType type) {
	
		this.name = name;
		this.type = type;
//		this.pid = pid;
	}
	
	public Number() {
		
	}

	public int getNid() {
		return nid;
	}

	public void setNid(int nid) {
		this.nid = nid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public NumberType getType() {
		return type;
	}

	public void setType(NumberType type) {
		this.type = type;
	}

//	public int getPid() {
//		return pid;
//	}
//
//	public void setPid(int pid) {
//		this.pid = pid;
//	}
	
	
	
	
	
}
