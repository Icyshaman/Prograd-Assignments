package dated_2022_06_06;

import java.util.ArrayList;
import java.util.List;

public class Q40_Books {
	
	private String title;
	private String publisher;
	private String rating;
	
	public Q40_Books(String title, String publisher, String rating) {
		super();
		this.title = title;
		this.publisher = publisher;
		this.rating = rating;
	}

	public Q40_Books(String title, String rating) {
		super();
		this.title = title;
		this.rating = rating;
		this.publisher = "O'Reilly";
	}
	
	public List<Q40_Books> getOReilly(Q40_Books[] books) {
		List<Q40_Books> oReillyBooks = new ArrayList<Q40_Books>();
		for(Q40_Books book : books) {
			if(book.rating.equals("O'Reilly")) {
				oReillyBooks.add(book);
			}
		}
		return oReillyBooks;
	}
	
	public static void main(String[] args) {
		Q40_Books book1 = new Q40_Books("The Twitter Book","PG");
		System.out.println(book1.title);
		System.out.println(book1.publisher);
		System.out.println(book1.rating);
	}
		
}
