package interfaceInheritance;

public class ReferenceBook extends LibraryBook {
	private String collection;
	
	public ReferenceBook (String auth, String bookTitle, 
			int refNum, int callNum, String collection) {
		super (auth, bookTitle, refNum, callNum);
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
	
	public void checkout () {
		System.out.println("Cannot check out a reference book");
	}
	
	public void returned () {
		System.out.println("Reference Book could not have been checked out"
				+ " -- Return impossible");
	}
	
	public String circulationStatus () {
		return "Non-circulating reference book";
	}	
	
	public String toString () {
		return super.toString() + "\n" + "Collection: " + collection;
	}
} 