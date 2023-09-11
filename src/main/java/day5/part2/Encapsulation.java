package day5.part2;

public class Encapsulation {

    public static void main(String[] args) {
        Book book = new Book("Harry Potter", 10);

        book.setCopies(-1);

        System.out.println(book.getName());

    }
}
class Book {
    private String name;
    private int copies;
    public Book (String name, int copies) {
        this.name = name;
        setCopies(copies);
    }
    public void setCopies(int copies) {
        if (copies < 0) {
            System.out.println("This is not valid");
        } else {
            this.copies = copies;
        }
    }

    public String getName() {
        return name;
    }


}
