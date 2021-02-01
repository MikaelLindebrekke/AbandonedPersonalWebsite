package movieHandler;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * A class for a movie
 * 
 * @author Mikael Lindebrekke
 */
@Entity
@Table(schema = "MLWebSite", name = "MovieList")
public class Movie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int movie_id;
	private String title;
	private int release_year;
	private double rating_IMDB;
	private String genre;
	private int length_Min;
	
	//Have the movie been seen or not. If it is seen then it is true else false. 
	private boolean seen;
	
	public Movie() {
		//Empty constructor. 
	}
	
	public Movie(String title, int year, double rating, String genre, int length, boolean seen) {
		this.title = title;
		this.release_year = year;
		this.rating_IMDB = rating;
		this.genre = genre;
		this.length_Min = length;
		this.seen = seen;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return release_year;
	}

	public void setYear(int year) {
		this.release_year = year;
	}

	public double getRatingIMDB() {
		return rating_IMDB;
	}

	public void setRatingIMDB(double ratingIMDB) {
		this.rating_IMDB = ratingIMDB;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getLengthMin() {
		return length_Min;
	}

	public void setLengthMin(int lengthMin) {
		this.length_Min = lengthMin;
	}
	
	public boolean getSeenStatus() {
		return this.seen;
	}
	
	public void setSeenStatus(boolean status) {
		this.seen = status;
	}
	
	
}
