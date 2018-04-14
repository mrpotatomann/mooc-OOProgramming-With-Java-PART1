
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // test your program here
        Library library = new Library();
        Book bookoflife = new Book("Book of life","Me",1973);
        Book harrypotter = new Book("Harry Potter","J.K. Rowling",1997);
        library.addBook(bookoflife);
        library.addBook(harrypotter);
        library.printBooks();
        
        ArrayList<Book> result = library.searchByTitle("Book of life");
        for (Book book : result) {
            System.out.println(result);
        }
        
        System.out.println("---");
    for (Book book: library.searchByPublisher("Me")) {
        System.out.println(book);
    }

    System.out.println("---");
    for (Book book: library.searchByYear(1997)) {
         System.out.println(book);
    }
        
   //The code     
   Library k = new Library();
   Book book1 = new Book("Core Java", "Addison Wesley", 2001);
   Book book2 = new Book("Test Driven Development", "Addison Wesley", 2001);
   Book book3 = new Book("Java Poweruser Guide", "Prentice Hall", 2012);
   k.addBook(book1);
   k.addBook(book2);
   k.addBook(book3);
        System.out.println(k.searchByTitle("Java"));
   //returned list with wrong length expected:<2> but was:<0>
    }
}
