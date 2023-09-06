package day5homework.java.Muaammar;
import java.util.*;

public class LibraryMember {
    private String memberId;
    private String firstName;
    private String lastName;
    private List<Book> borrowedBooks;

    public LibraryMember(String memberId, String firstName, String lastName) {
        this.memberId = memberId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getMemberId() {
        return memberId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Book book) {
        if (book.getAvailableCopies() > 0) {
            borrowedBooks.add(book);
            book.checkoutBook();
        } else {
            System.out.println("book is not availble");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.returnBook();
        }
    }

}
