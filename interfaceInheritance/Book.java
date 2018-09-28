package interfaceInheritance;

public class Book {
	protected String author;
	protected String title;
	protected int isbn;
	
	public Book () {
		author = new String ();
		title = new String ();
		isbn = 0;
	}
	
	public Book (String auth, String bookTitle, int refNum) {
		author = auth;
		title = bookTitle;
		isbn = refNum;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	
	public String toString () {
		return "Title: " + title + "\n"
				+ "Author: " + author + "\n"
				+ "ISBN: " + isbn;
	}
	
}
