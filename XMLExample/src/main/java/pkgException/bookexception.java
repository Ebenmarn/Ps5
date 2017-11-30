package pkgException;
import pkgLibrary.Book;
public class bookexception extends Exception {
	private Book book;
	private String id;
	public bookexception(Book book) {
		super();
		this.book = book;
	}
	
	public bookexception(String id) {
		super();
		this.id = id;
	}
	
}
