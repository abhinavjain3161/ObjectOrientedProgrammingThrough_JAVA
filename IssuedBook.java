package issued;
import library.Book;

public class IssuedBook extends Book{
	private String issuedTo;
	public IssuedBook(String t, String a , double p, String name){
		super(t, a, p);
		issuedTo = name;
	}
	public void displayIssuedBook(){
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);

		System.out.println("Issued To: " + issuedTo);
		System.out.println("Price: " + getPrice());
	}
}