package interfaceInheritance;

public class CirculatingBook extends LibraryBook {
	private String currentHolder;
	private String dueDate;
	
	public CirculatingBook (String auth, String bookTitle, String isbn, String callNum) {
		super (auth, bookTitle, isbn, callNum);
		currentHolder = null;
		dueDate = null;
	}
	
	public void checkout (String patron, String dueDate) {
		this.currentHolder = patron;
		this.dueDate = dueDate;
	}
	
	public void returned () {
		this.currentHolder = null;
		this.dueDate = null;
	}
}
