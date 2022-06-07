package dated_2022_06_06;

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
	
	
		
}
