package interfaceInheritance;

public class Book {
	protected String author;
	protected String title;
	protected String isbn;
	
	public Book () {
		author = new String ();
		title = new String ();
		isbn = new String ();
	}
	
	public Book (String auth, String bookTitle, String isbn) {
		this.author = auth;
		this.title = bookTitle;
		this.isbn = isbn;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String toString () {
		return "Title: " + title + "\n"
				+ "Author: " + author + "\n"
				+ "ISBN: " + isbn;
	}
	
}
