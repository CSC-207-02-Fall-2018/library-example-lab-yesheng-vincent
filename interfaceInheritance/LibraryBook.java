package interfaceInheritance;

import java.lang.Comparable;

public abstract class LibraryBook extends Book 
					implements Comparable <LibraryBook> {

	protected int callNumber;
	
	public LibraryBook (String auth, String bookTitle, int refNum, int callNum) {
		super (auth, bookTitle, refNum);
		callNumber = callNum;
	}

	public int getCallNumber() {
		return callNumber;
	}

	public void setCallNumber(int callNumber) {
		this.callNumber = callNumber;
	}

	abstract public void checkout ();

	abstract public void returned ();

	abstract public String circulationStatus ();

	public int compareTo(LibraryBook book) {
		if (this.callNumber == book.getCallNumber()) {
			return 0;
		}
		else if (this.callNumber > book.getCallNumber()) {
			return -1;
		}
		else {
			return 1;
		}
	}

	public String toString () {
		return super.toString() + "\n" + "Call number: " + callNumber;
	}
}
