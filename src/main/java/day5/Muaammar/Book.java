package day5homework.java.Muaammar;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private int availableCopies;

    public Book(String title, String author, String isbn, int availableCopies) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.availableCopies = availableCopies;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public void checkoutBook() {
        if (availableCopies > 0) {
            availableCopies--;
            System.out.println("you can checkout this book: "+ title );
        } else {
            System.out.println("the book :"+ title +" ,has no more available copies ");
        }
    }

    public void returnBook() {
        availableCopies++;
        System.out.println("Book " + title+ " returned ");
    }

}
