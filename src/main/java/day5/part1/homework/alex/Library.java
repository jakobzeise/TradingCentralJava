package day5.part1.homework.alex;

public class Library {

    public static void main(String[] args) {


        Book toKillAMockingBird = new Book("To Kill a Mockingbird", "Harper Lee", 97884181528L, 3);
        Book book2 = new Book("Lord of the Flies", "William Golding", 9780571056866L, 6);
        Book book3 = new Book("House of Leaves", "Mark Z. Danielewski", 9780375410345L, 2);
        Book book4 = new Book("Harry Potter", "J.K. Rowling", 1408855895L, 7);

        LibraryMember member1 = new LibraryMember(1, "Alex", "Hyde");
        LibraryMember member2 = new LibraryMember(2, "Alexi", "Hydee");
        LibraryMember member3 = new LibraryMember(3, "Alexo", "Hydo");
        LibraryMember member4 = new LibraryMember(4, "Alexmop", "Hydemop");

//        toKillAMockingBird.bookInfo();
//
//        toKillAMockingBird.checkOut();

        member1.borrowBook(toKillAMockingBird);
        member1.borrowBook(book2);


        member3.borrowBook(book4);




    }
}
