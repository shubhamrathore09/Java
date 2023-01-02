package useCase;

import model.Post;
import timelineDao.Dao;
import timelineDao.DaoImpl;

public class InserRecord {
public static void main(String[] args) {
	
	Dao dao=new DaoImpl();
	Post post=new Post();
	post.setDcription("hellow");
	post.setTitle("java");
	dao.AddPost(post);
	
}
}
