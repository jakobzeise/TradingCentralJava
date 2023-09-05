package day5.homework.Andrei;

public class LibrarySystem {
    public static void main(String[] args){
        Book book1 = new Book("Moby-Dick", "Herman Melville", "9780763630188", 3 );
        Book book2 = new Book("Don Quixote", "Miguel de Cervantes", "9788408061052", 1);
        Book book3 = new Book("Nineteen Eighty-Four", "Georghe Orwell", "9789510459959", 2);

        LibraryMember lm1 = new LibraryMember(1, "John", "Doe");

        System.out.println(lm1);
        lm1.borrowBook(book1);
        lm1.borrowBook(book1);
        lm1.borrowBook(book2);
        lm1.borrowBook(book2);
        lm1.borrowBook(book3);

        lm1.displayBooks();
        System.out.println("--------------------");

        lm1.returnBook(book1);
        lm1.returnBook(book2);

        lm1.displayBooks();
    }
}
