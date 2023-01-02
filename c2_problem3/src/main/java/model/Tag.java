package model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Tag {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int tagId;
	private String tagname;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Post> postlist;

	public Tag(int tagId, String tagname, List<Post> postlist) {
		super();
		this.tagId = tagId;
		this.tagname = tagname;
		this.postlist = postlist;
	}

	public Tag(String tagname, List<Post> postlist) {
		super();
		this.tagname = tagname;
		this.postlist = postlist;
	}

	public Tag() {
		super();
	}

	public int getTagId() {
		return tagId;
	}

	public void setTagId(int tagId) {
		this.tagId = tagId;
	}

	public String getTagname() {
		return tagname;
	}

	public void setTagname(String tagname) {
		this.tagname = tagname;
	}

	public List<Post> getPostlist() {
		return postlist;
	}

	public void setPostlist(List<Post> postlist) {
		this.postlist = postlist;
	}

	@Override
	public String toString() {
		return "Tag [tagId=" + tagId + ", tagname=" + tagname + "]";
	}
	
	
	
	
}
