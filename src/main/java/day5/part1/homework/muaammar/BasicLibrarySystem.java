package day5.part1.homework.muaammar;

public class BasicLibrarySystem {
    public static void main(String[] args) {

        Book[] books = {
                new Book("Book1_title", "Riad Numa", "ABCD12345", 6),
                new Book("Book2_title", "Francois Reit", "FGHIJ67890", 5),
                new Book("Book3", "Sophia John", "bvfd67890", 3)
        };

        LibraryMember[] members = {
                new LibraryMember("ID1234", "John", "Joao"),
                new LibraryMember("XX56789", "Alex", "Bob")
        };


        for (LibraryMember member : members) {
            for (Book book : books) {
                member.borrowBook(book);
                book.checkoutBook();
            }
        }

        for (LibraryMember member : members) {
            System.out.println(member.getFirstName() + " borrowed following books:");
            for (Book book : books) {
                if (member.getBorrowedBooks().contains(book)) {
                    System.out.println(book.getTitle());
                }
            }
            System.out.println();
        }

        for (LibraryMember member : members) {
            for (Book book : books) {
                member.returnBook(book);
                book.returnBook();
            }
        }
    }
}
