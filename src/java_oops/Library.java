/**
 * 
 */
package java_oops;
import java.util.*;
/**
 * @author srinidhi.k
 *
 */
public class Library {
	 public List<Book> getAvailableBooks() {
		return availableBooks;
	}

	public void setAvailableBooks(List<Book> availableBooks) {
		this.availableBooks = availableBooks;
	}

	public List<Member> getMembers() {
		return members;
	}

	public void setMembers(List<Member> members) {
		this.members = members;
	}

	private List<Book> availableBooks;
	    public Library(List<Book> availableBooks, List<Member> members) {
		super();
		this.availableBooks = availableBooks;
		this.members = members;
	}

		private List<Member> members;
		
		public void returnBook(int returnerId, String isbnToReturn, Book book) {
		
			this.getAvailableBooks().get(returnerId);
			this.availableBooks.remove(returnerId);
			System.out.println("the book has been removed/returned"+this.getAvailableBooks());
		}

		public void issueBook(int borrowerId, String isbnToIssue, Member member, Book book) {
			
			this.getAvailableBooks().get(borrowerId);
		    List<Book> issue = new ArrayList<>();
		    issue.add(book);
		    System.out.println("book has ben used for the member" + issue);
		    
			
		}

		public void displayBorrowedBooks(int memberId, Member member) {

			member.getBorrowedBooks();
			System.out.println("the avaiable boorowed books are" + member.getBorrowedBooks());
		}

		public void displayAvailableBooks() {

           this.getAvailableBooks();
           System.out.println("the avaiable books present are"+ this.getAvailableBooks());
			
		}
	    
	    
	 
}
