package utils;

import java.util.ArrayList;
import java.util.List;

import movieHandler.Movie;

public class MovieUtil {
	
	public Movie chooseRandomMovie(List<Movie> movies) {
		Movie m = new Movie();
		
		//Select a random movie from the unseen movie list.
		
		
		
		return m;
	}
	
	
	public List<Movie> selectUnseenMovies(List<Movie> allMovies) {
		
		List<Movie> unseenMovies = new ArrayList<Movie>();
		
		for (Movie m : allMovies) {
			if (!m.getSeenStatus()) {
				unseenMovies.add(m);
			}
		}
		
		return unseenMovies;
	}
	
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
