package interfaceInheritance;

import java.lang.Comparable;

public abstract class LibraryBook extends Book 
					implements Comparable <LibraryBook> {

	protected String callNumber;
	
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

	abstract public void checkout (String patron, String dueDate);

	abstract public void returned ();

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

	public String toString () {
		return super.toString() + "\n" + "Call number: " + callNumber;
	}
}
