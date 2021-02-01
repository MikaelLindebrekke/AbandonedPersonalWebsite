package utils;

import java.util.ArrayList;
import java.util.List;

import movieHandler.Movie;

/** 
 *	A utility class for handling movies in the movie archive
 * 
 * @author Mikael Lindebrekke
 */

public class MovieUtil {
	/**
	 * Takes a list of movies and select a movie at random 
	 * 
	 * @param movies
	 * @return movie
	 */
	public Movie chooseRandomMovie(List<Movie> movies) {
		int randomNumber = (int) (Math.random() * movies.size());
		
		return movies.get(randomNumber);
	}
	
	/**
	 * Selects all the movies with status unseen from the main movie list. 
	 * 
	 * @param allMovies
	 * @return unseenMovies
	 */
	public List<Movie> selectUnseenMovies(List<Movie> allMovies) {
		
		List<Movie> unseenMovies = new ArrayList<Movie>();
		
		for (Movie m : allMovies) {
			if (!m.getSeenStatus()) {
				unseenMovies.add(m);
			}
		}
		
		return unseenMovies;
	}
	/**
	 * Selects all the movies with status seen from the main movie list. 
	 * 
	 * @param allMovies
	 * @return seenMovies
	 */
	
	public List<Movie> selectSeenMovies(List<Movie> allMovies) {
		
		List<Movie> seenMovies = new ArrayList<Movie>();
		
		for (Movie m : allMovies) {
			if (m.getSeenStatus()) {
				seenMovies.add(m);
			}
		}
		
		return seenMovies;
	}
	

}
