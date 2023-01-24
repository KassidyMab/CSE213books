package library;

public class books {
	int ISBN;
	String Title;
	String Authors;
	String Publisher;
	int Year;
	String ShortDesc;
	

	void showDetails() {
		System.out.println("Book information");
		System.out.println("-----");
		System.out.println("ISBN: " + this.ISBN);
		System.out.println("Title: " + this.Title);
		System.out.println("Author(s): " + this.Authors);
		System.out.println("Publisher: " + this.Publisher);
		System.out.println("Year: " + this.Year);
		System.out.println("Short description: " + this.ShortDesc + ".");
		System.out.println("-----");
	}
	
	// Constructor
	public books (int ISBN, String Title, String Authors, String Publisher, int Year, String ShortDesc) {
		this.ISBN = ISBN;
		this.Title = Title;
		this.Authors = Authors;
		this.Publisher = Publisher;
		this.Year = Year;
		this.ShortDesc = ShortDesc;
	}	
}
