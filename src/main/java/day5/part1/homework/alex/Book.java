package day5.part1.homework.alex;

public class Book {

    String bookTitle;
    String bookAuthor;
    long id;
    int copies;


    public Book(String bookTitle, String bookAuthor, long id, int copies) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.id = id;
        this.copies = copies;
    }


    public String getBookTitle() {
        return bookTitle;
    }


    public String getBookAuthor() {
        return bookAuthor;
    }


    public long getId() {
        return id;
    }


    public int getCopies() {
        return copies;
    }

    public void checkIn() {
        copies++;
        System.out.println("The Library has: " + copies + " copies of: " + bookTitle);
    }

    public void checkOut() {
        copies--;
        System.out.println("The Library has: " + copies + " copies of: " + bookTitle);
    }

    public void bookInfo() {
        System.out.println("Here is the stored information on " + bookTitle + ":\nAuthor: " + bookAuthor + "\nisbn: " + id + "\nAvailable copies: " + copies);
    }


    @Override
    public String toString() {
        return bookTitle;
    }


}
