public class Main {
    public static void main(String[] args) {
        // Create a new book
        Book book1 = new Book("The Shining", "Stephen King", "ISBN1", 5);
        Book book2 = new Book("Dr Sleep", "Stephen King", "ISBN2", 6);
        Book book3 = new Book("Christine", "Stephen King", "ISBN3", 7);
        // Create a new library member
        LibraryMember member1 = new LibraryMember(1, "John", "Doe");
        LibraryMember member2 = new LibraryMember(2, "Jane", "Deere");
        LibraryMember member3 = new LibraryMember(3, "James", "Bond");
        // Member borrows a book
        member1.borrowBook(book1);
        member2.borrowBook(book2);
        member2.borrowBook(book3);

        // Print the details of the borrowed books
        for (Book book : member1.getBorrowedBooks()) {
            System.out.println("Borrowed book: " + book.getTitle());
        }
        for (Book book : member2.getBorrowedBooks()) {
            System.out.println("Borrowed book: " + book.getTitle());
        }
        for (Book book : member3.getBorrowedBooks()) {
            System.out.println("Borrowed book: " + book.getTitle());
        }
        // Member returns a book
        member1.returnBook(book1);
        member2.returnBook(book2);
        member2.returnBook(book3);
    }
}