package pkgLibrary;

import java.util.ArrayList;

import javax.xml.bind.annotation.*;

import pkgException.bookexception;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)

public class Catalog {

	@XmlAttribute
	int id;	
	
	@XmlElement(name="book")
	ArrayList<Book> books;
	
	
	public int getId() {
		return id;
	}
	

	public void setId(int id) {
		this.id = id;
	}
	public ArrayList<Book> getBooks() {
		return books;
	}
	

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}
	
	public void addBooks(Book Book) throws bookexception {
		
		for (Book book: books) {
				if (book.getId().equals(Book.getId())) {
					throw new bookexception(book);
					
				}
			}
			
		books.add(Book);
	}

	
	


	
	
	
	
}
