package interfaceInheritance;

public class CirculatingBook extends LibraryBook {
	private String currentHolder;
	private String dueDate;
	
	public CirculatingBook (String auth, String bookTitle, int refNum, int callNum) {
		super (auth, bookTitle, refNum, callNum);
		currentHolder = null;
		dueDate = null;
	}
}
