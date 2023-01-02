package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Movie  extends Hotstar{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int movieId;
	private String movieName;
	private String gener;
	
	public Movie(int userId, String name, int rating, Subcription subcription, int movieId, String movieName,
			String gener) {
		super(userId, name, rating, subcription);
		this.movieId = movieId;
		this.movieName = movieName;
		this.gener = gener;
	}
	public Movie(int userId, String name, int rating, Subcription subcription, String movieName, String gener) {
		super(userId, name, rating, subcription);
		this.movieName = movieName;
		this.gener = gener;
	}
	public Movie( String name, int rating, Subcription subcription, String movieName, String gener) {
		super( name, rating, subcription);
		this.movieName = movieName;
		this.gener = gener;
	}
	public Movie() {
//		super(userId, name, rating, subcription);
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getGener() {
		return gener;
	}
	public void setGener(String gener) {
		this.gener = gener;
	}
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", gener=" + gener + "]";
	}
	
	
	
	
}
