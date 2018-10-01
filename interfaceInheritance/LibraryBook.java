package interfaceInheritance;

import java.lang.Comparable;

public abstract class LibraryBook extends Book 
					implements Comparable <LibraryBook> {

	protected String callNumber;
	
	/**
	 * Constructor
	 * 
	 * @param auth			author
	 * @param bookTitle		book title
	 * @param isbn			isbn number
	 * @param callNum		book call number
	 */
	public LibraryBook (String auth, String bookTitle, String isbn, String callNum) {
		super (auth, bookTitle, isbn);
		callNumber = callNum;
	}

	/**
	 * @return the callNumber
	 */
	public String getCallNumber() {
		return callNumber;
	}

	/**
	 * @param callNumber the callNumber to set
	 */
	public void setCallNumber(String callNumber) {
		this.callNumber = callNumber;
	}
	
	/**
	 * Checks out a book if possible
	 * 
	 * @param patron		Patron who checked the book out
	 * @param dueDate		Date the book must be returned by
	 */
	abstract public void checkout (String patron, String dueDate);

	/**
	 * Returns a book if possible (works whether the book was 
	 * already checked out or not).
	 */
	abstract public void returned ();

	/**
	 * Status of the book (ie checked out or not)
	 * 
	 * @return		Returns a string containing checkout information or
	 * 				"book available on shelves" if not checked out
	 */
	abstract public String circulationStatus ();
	
	/** 
	 * implementation of Comparable's compareTo method
	 * 
	 * @param lib	  Library object being compared
	 * @return 0 if call numbers of this and lib match
	 *         < 0 if call number of this comes before call number of lib
	 *         > 0 otherwise
	 */
	public int compareTo(LibraryBook book) {
		return this.callNumber.compareTo(book.getCallNumber());
	}

	/**
	 * toString method
	 * 
	 * @return		Returns string containing field values
	 */
	public String toString () {
		return super.toString() + "\n" + "Call number: " + callNumber;
	}
}
