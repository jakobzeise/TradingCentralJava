package day5.part1.homework.emil;

import java.util.ArrayList;
public class LibraryMember {
    private int memberId;
    private String firstName;
    private String lastName;
    private ArrayList<Book> borrowedBooks;

    // Constructor
    public LibraryMember(int memberId, String firstName, String lastName) {
        this.memberId = memberId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.borrowedBooks = new ArrayList<>();
    }

    // Getter methods
    public int getMemberId() {
        return memberId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    // Borrow a book
    public void borrowBook(Book book) {
        if (book.getAvailableCopies() > 0) {
            borrowedBooks.add(book);
            // Reduce the available copies of the book by 1
            // book.setAvailableCopies(book.getAvailableCopies() - 1);
        } else {
            System.out.println("Sorry, this book is currently unavailable.");
        }
    }

    // Return a book
    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            // Increase the available copies of the book by 1
             book.setAvailableCopies(book.getAvailableCopies() + 1);
        } else {
            System.out.println("This book was not borrowed by this member.");
        }
    }
}