package model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Post {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int postId;
	private String title;
	private String dcription;
	private LocalDateTime dateTime;
	
	@ManyToMany(mappedBy = "postlist",cascade = CascadeType.ALL)
	private List<Tag> taglist;

	public Post(int postId, String title, String dcription, LocalDateTime dateTime, List<Tag> taglist) {
		super();
		this.postId = postId;
		this.title = title;
		this.dcription = dcription;
		this.dateTime = dateTime;
		this.taglist = taglist;
	}

	public Post(String title, String dcription, LocalDateTime dateTime, List<Tag> taglist) {
		super();
		this.title = title;
		this.dcription = dcription;
		this.dateTime = dateTime;
		this.taglist = taglist;
	}

	public Post() {
		super();
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDcription() {
		return dcription;
	}

	public void setDcription(String dcription) {
		this.dcription = dcription;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public List<Tag> getTaglist() {
		return taglist;
	}

	public void setTaglist(List<Tag> taglist) {
		this.taglist = taglist;
	}

	@Override
	public String toString() {
		return "Post [postId=" + postId + ", title=" + title + ", dcription=" + dcription + ", dateTime=" + dateTime
				+ "]";
	}
	
	
	
	
}
