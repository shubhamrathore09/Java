package timelineDao;


import model.Post;
import model.Tag;
import postException.PostNotFoundException;
import tagException.TagNotFoundException;

public interface Dao {
	public void AddPost(Post post);
	public Post getPost(int id) throws PostNotFoundException;
	public Tag getTag(int id)throws TagNotFoundException;
	
 }
