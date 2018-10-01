package interfaceInheritance;

public class ReferenceBook extends LibraryBook {
	private String collection;
	
	/**
	 * Constructor
	 * 
	 * @param auth			author
	 * @param bookTitle		book title
	 * @param isbn			isbn number
	 * @param callNum		book call number
	 * @param collection	collection name
	 */
	public ReferenceBook (String auth, String bookTitle, 
			String isbn, String callNum, String collection) {
		super (auth, bookTitle, isbn, callNum);
		this.collection = collection;
	}

	/**
	 * @return the collection
	 */
	public String getCollection() {
		return collection;
	}

	/**
	 * @param collection the collection to set
	 */
	public void setCollection(String collection) {
		this.collection = collection;
	}
	
	/**
	 * Checks out a book if possible. Reference books cannot be checked
	 * out so prints message "Cannot check out a reference book"
	 * 
	 * @param patron		Patron who checked the book out
	 * @param dueDate		Date the book must be returned by
	 */
	public void checkout (String patron, String dueDate) {
		System.out.println("Cannot check out a reference book");
	}
	
	/**
	 * Returns a book if possible (works whether the book was 
	 * already checked out or not). As reference books cannot
	 * be returned, prints message "Reference Book could not 
	 * have been checked out -- Return impossible")
	 */
	public void returned () {
		System.out.println("Reference Book could not have been checked out"
				+ " -- Return impossible");
	}

	/**
	 * Status of the book (ie checked out or not)
	 * 
	 * @return		Returns string "Non-circulating reference book"
	 */
	public String circulationStatus () {
		return "Non-circulating reference book";
	}	
	
	/**
	 * toString method
	 * 
	 * @return		Returns string containing field values
	 */
	public String toString () {
		return super.toString() + "\n" + "Collection: " + collection;
	}
} 
