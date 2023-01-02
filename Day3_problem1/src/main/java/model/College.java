package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class College {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	private String cname;
	private String caddress;
	
	@OneToMany(mappedBy = "college",cascade = CascadeType.ALL)
	private List<Student> list=new ArrayList<Student>();

	public College(int cid, String cname, String caddress, List<Student> list) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.caddress = caddress;
		this.list = list;
	}

	public College(String cname, String caddress, List<Student> list) {
		super();
		this.cname = cname;
		this.caddress = caddress;
		this.list = list;
	}
	
	

	public College(int cid, String cname, String caddress) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.caddress = caddress;
	}

	public College() {
		super();
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCaddress() {
		return caddress;
	}

	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}

	public List<Student> getList() {
		return list;
	}

	public void setList(List<Student> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "College [cid=" + cid + ", cname=" + cname + ", caddress=" + caddress + "]";
	}
}
