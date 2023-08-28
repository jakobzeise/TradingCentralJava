package day5.homework.Andrei;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private int availableCopies;

    public Book(String title, String author, String isbn, int availableCopies){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.availableCopies = availableCopies;
    }

    public boolean checkoutBook(){
        if(availableCopies < 1){
            System.out.println("No more copies available for: " + title);
            return false;
        }
        availableCopies--;
        return true;
    }

    public boolean returnBook(){
        availableCopies++;
        return true;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public String getIsbn(){
        return isbn;
    }

    public int getAvailableCopies(){
        return availableCopies;
    }

    @Override
    public String toString(){
        return String.format("Title: %s\n" +
                "Author: %s\n" +
                "ISBN: %s\n" +
                "Available Copies: %d\n", title, author, isbn, availableCopies);
    }
}
