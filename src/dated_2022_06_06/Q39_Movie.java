package dated_2022_06_06;

import java.util.ArrayList;
import java.util.List;

public class Q39_Movie {

	private String title;
	private String studio;
	private String rating;
	
	public Q39_Movie(String title, String studio, String rating) {
		super();
		this.title = title;
		this.studio = studio;
		this.rating = rating;
	}
	
	public Q39_Movie(String title, String studio) {
		super();
		this.title = title;
		this.studio = studio;
		this.rating = "PG";
	}

	public List<Q39_Movie> getPg(Q39_Movie[] movies) {
		List<Q39_Movie> pgRatedMovies = new ArrayList<Q39_Movie>();
		for(Q39_Movie mv : movies) {
			if(mv.rating.equals("PG")) {
				pgRatedMovies.add(mv);
			}
		}
		return pgRatedMovies;
	}
	
	public static void main(String[] args) {
		Q39_Movie mv1 = new Q39_Movie("Casino Royale","Eon Productions","PG-13");
		System.out.println(mv1.title);
		System.out.println(mv1.studio);
		System.out.println(mv1.rating);
	}
	
}
