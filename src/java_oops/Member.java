/**
 * 
 */
package java_oops;
import java.util.*;

/**
 * @author srinidhi.k
 *
 */
public class Member {
	 public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public List<Book> getBorrowedBooks() {
		return borrowedBooks;
	}
	public void setBorrowedBooks(List<Book> borrowedBooks) {
		this.borrowedBooks = borrowedBooks;
	}
	public Member(String name, int memberId, List<Book> borrowedBooks) {
		super();
		this.name = name;
		this.memberId = memberId;
		this.borrowedBooks = borrowedBooks;
	}
	private String name;
	    private int memberId;
	    private List<Book> borrowedBooks;
}
