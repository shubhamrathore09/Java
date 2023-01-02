package timelineDao;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Post;
import model.Tag;
import postException.PostNotFoundException;
import tagException.TagNotFoundException;

public class DaoImpl implements Dao{

	public void AddPost(Post post) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ac");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		
		Post p1=post;
		p1.setDateTime(LocalDateTime.now());
		
		List<Post> plist=new ArrayList<Post>();
		
		plist.add(p1);
		
		
		Tag t1=new Tag();
		t1.setTagname("anuj");
		
		Tag t2=new Tag();
		t2.setTagname("papu");
		
		Tag t3=new Tag();
		t3.setTagname("niraj");
		
		List<Tag> tlist=new ArrayList<Tag>();
		tlist.add(t1);
		tlist.add(t2);
		tlist.add(t3);
		
		t1.setPostlist(plist);
		t2.setPostlist(plist);
		t3.setPostlist(plist);
		
		p1.setTaglist(tlist);
		
	
		em.persist(p1);
		
		em.getTransaction().commit();
		em.close();
		
		
	}

	public Post getPost(int id) throws PostNotFoundException {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ac");
		EntityManager em=emf.createEntityManager();
		
		Post post=em.find(Post.class, id);
		if(post==null) {
			throw new PostNotFoundException("no post available");
		}
		
		System.out.println(post.getTaglist());
		
		return post;
		
	}

	public Tag getTag(int id) throws TagNotFoundException {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ac");
		EntityManager em=emf.createEntityManager();
		
		Tag tag=em.find(Tag.class, id);
		if(tag==null) {
			throw new TagNotFoundException("no post available");
		}
		System.out.println(tag.getPostlist());
	
		return tag;
	}


}
