package day5.part1.homework.ioana;

public class Book {

    String title;
    String  author;
    int ISBN;
    int availableCopies;

    //constructor
    Book(String title, String author, int ISBN, int availableCopies) {
        this.title=title;
        this.author=author;
        this.ISBN=ISBN;
        this.availableCopies=availableCopies;
    }

    // Implement methods to checkout a book (decrease available copies) and returnBook (increase available copies

    public void checkout () {
        availableCopies--;
        System.out.println("The new number of available copies after checkout is " + availableCopies );

    }

    public void returnBook () {
        availableCopies++;
        System.out.println("The new number of available copies after the return process was over is " + availableCopies );
    }

}
