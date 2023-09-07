package day5.part1.homework.alex;

import java.util.ArrayList;


public class LibraryMember {

    int memberId;
    String firstName;
    String lastName;
    ArrayList<Book> borrowedBooks = new ArrayList<>();


    public LibraryMember(int memberId, String firstName, String lastName) {
        this.memberId = memberId;
        this.firstName = firstName;
        this.lastName = lastName;

    }


    /*
    you should take the Book itself as an argument
     */
    public void borrowBook(Book book) {
        if (book.copies > 0) {
            borrowedBooks.add(book);
            System.out.println("These are the books " + firstName + " borrowed:");
            System.out.println(borrowedBooks);
        } else {
            System.out.println("There are no remaining copies of this book in the library.");
        }


    }


    /*
    you should take the Book itself as an argument
     */
    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }


}
