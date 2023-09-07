package day5.part1.homework.ioana;

public class BasicLibrarySystem {

    Book book2 = new Book("Lady", "Gogo", 22222, 4 );
    Book book3 = new Book("Peasant", "Gaga", 33333, 9 );
    Book book4 = new Book("Commoner", "Tutu", 44444, 13 );
    Book book5 = new Book("Madame", "Tata", 66666, 55 );
    Book book6 = new Book("Child", "Toto", 88888, 3 );

    public static void main(String[] args) {
        Book book1 = new Book("King", "GIGI", 11111, 7 );

        book1.checkout();
    }



/*    LibraryMember member1 =  new LibraryMember( 123, "Ionel", "Popescu", {"Peasant","King", "Lady"} );
    LibraryMember member1 =  new LibraryMember( 234, "Dana", "Ionescu", {"Peasant", "Lady","Commoner"} );
    LibraryMember member1 =  new LibraryMember( 345, "Ion", "Georgescu", {"King", "Madame"} );
    LibraryMember member1 =  new LibraryMember( 456, "Lavinia", "Mihai", {"King", "Child"} );
    LibraryMember member1 =  new LibraryMember( 567, "Sandy", "Iancy", {"Peasant", "Lady", "Madame","Commoner","Peasant"} );
    LibraryMember member1 =  new LibraryMember( 678, "Don", "Dor", {"Child", "Lady", "Madame"} );
    LibraryMember member1 =  new LibraryMember( 789, "Vin", "Duca", {"King", "Lady", "Madame", "Child","Peasant"} );

*/


}
