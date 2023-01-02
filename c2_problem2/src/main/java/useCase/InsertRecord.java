package useCase;

import java.io.Serial;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Movie;
import model.Series;
import model.Subcription;

public class InsertRecord {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ac");
		EntityManager em=emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Movie m1=new Movie();
		m1.setGener("hindi");
		m1.setMovieName("hum");
		m1.setName("shubham");
		m1.setRating(4);
		m1.setSubcription(Subcription.Active);
		m1.setUserId(2);
	
		
		Movie m2=new Movie();
		m2.setGener("hindi");
		m2.setMovieName("kal");
		m2.setName("shu");
		m2.setRating(4);
		m2.setSubcription(Subcription.Inactive);
		m2.setUserId(3);
	
		
		
		Movie m3=new Movie();
		m3.setGener("hindi");
		m3.setMovieName("tomy");
		m3.setName("sh");
		m3.setRating(4);
		m3.setSubcription(Subcription.Inactive);
		m3.setUserId(3);
		
		Movie m4=new Movie();
		m4.setGener("hindi");
		m4.setMovieName("hum");
		m4.setName("shubham");
		m4.setRating(4);
		m4.setSubcription(Subcription.Active);
		m4.setUserId(2);
		
		
	Series s1=new Series();
	s1.setName("shubban");
	s1.setNumberOfEpisod(2);
	s1.setRating(5);
	s1.setUserId(2);
	s1.setSubcription(Subcription.Active);
	
	Series s2=new Series();
	s2.setName("shubban");
	s2.setNumberOfEpisod(2);
	s2.setRating(2);
	s2.setUserId(3);
	s2.setSubcription(Subcription.Inactive);
	
	Series s3=new Series();
	s3.setName("shuan");
	s3.setNumberOfEpisod(2);
	s3.setRating(2);
	s3.setUserId(3);
	s3.setSubcription(Subcription.Inactive);
	
	Series s4=new Series();
	s4.setName("shubn");
	s4.setNumberOfEpisod(2);
	s4.setRating(2);
	s4.setUserId(2);
	s4.setSubcription(Subcription.Active);
	
	
	
	
		
		
		
		em.persist(m1);
		em.persist(m3);
		em.persist(m2);
		em.persist(m4);
		
		em.persist(s1);
		em.persist(s2);
		em.persist(s3);
		em.persist(s4);
		
		em.getTransaction().commit();
		em.close();
		
	}
}
