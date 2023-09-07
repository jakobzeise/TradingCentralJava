package day5.part1.homework.andrei;

import java.util.ArrayList;
import java.util.List;
public class LibraryMember {
    private int memberId;
    private String firstName;
    private String lastName;
    private List<Book>borrowedBooks;

    public LibraryMember(int memberId, String firstName, String lastName){
        this.memberId = memberId;
        this.firstName = firstName;
        this.lastName = lastName;
        borrowedBooks = new ArrayList<>();
    }

    public int getMemberId(){
        return memberId;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public List<Book> getBorrowedBooks(){
        return borrowedBooks;
    }

    public boolean borrowBook(Book book){
        if(book.getAvailableCopies() < 1){
            return false;
        }
        book.checkoutBook();
        borrowedBooks.add(book);
        return true;
    }

    public boolean returnBook(Book book){
        book.returnBook();
        borrowedBooks.remove(book);
        return true;
    }

    public void displayBooks(){
        for(int i = 0; i < borrowedBooks.size(); i++){
            System.out.println(borrowedBooks.get(i));
        }
    }

    @Override
    public String toString(){
        return String.format("MemberID: %d\n" +
                "FirstName: %s\n" +
                "LastName: %s\n", memberId, firstName, lastName);
    }
}
