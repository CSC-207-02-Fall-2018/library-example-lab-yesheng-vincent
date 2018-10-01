package interfaceInheritance;

public class CirculatingBook extends LibraryBook {
	private String currentHolder;
	private String dueDate;
	
	/**
	 * Constructor
	 * 
	 * @param auth			author
	 * @param bookTitle		book title
	 * @param isbn			isbn number
	 * @param callNum		book call number
	 */
	public CirculatingBook (String auth, String bookTitle, String isbn, String callNum) {
		super (auth, bookTitle, isbn, callNum);
		currentHolder = null;
		dueDate = null;
	}
	
	/**
	 * Checks out a book if possible
	 * 
	 * @param patron		Patron who checked the book out
	 * @param dueDate		Date the book must be returned by
	 */
	public void checkout (String patron, String dueDate) {
		this.currentHolder = patron;
		this.dueDate = dueDate;
	}
	
	/**
	 * Returns a book if possible (works whether the book was 
	 * already checked out or not).
	 */
	public void returned () {
		this.currentHolder = null;
		this.dueDate = null;
	}

	/**
	 * Status of the book (ie checked out or not)
	 * 
	 * @return		Returns a string containing checkout information or
	 * 				"book available on shelves" if not checked out
	 */
	public String circulationStatus() {
		if (this.currentHolder != null) {
			return this.currentHolder + " must return by " 
					+ this.dueDate;
		}
		else {
			return "book available on shelves";
		}
	}
	
	/**
	 * toString method
	 * 
	 * @return		Returns string containing field values
	 */
	public String toString () {
		if (this.currentHolder != null) {
			return super.toString() + "\n" +" patron: " + currentHolder + "\n" 
					+ "Due Date: " + dueDate;
		}
		else {
			return super.toString();
		}
	}
}