
import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<Book>();
    }

    public void addBook(Book newBook) {
        books.add(newBook);
    }

    public void printBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public ArrayList<Book> searchByTitle(String title) {

        ArrayList<Book> foundByTitle = new ArrayList<Book>();
        for (Book book : books) {
            if(StringUtils.included(book.title(), title)){
                foundByTitle.add(book);
            }
        }
        
        return foundByTitle;
    }
    

    public ArrayList<Book> searchByPublisher(String publisher) {

        ArrayList<Book> foundByPublisher = new ArrayList<Book>();
        for (Book book : books) {
            if(StringUtils.included(book.publisher(), publisher)){
                foundByPublisher.add(book);
            }
        }
        
        return foundByPublisher;
    }
 

    public ArrayList<Book> searchByYear(int year) {

        ArrayList<Book> foundByYear = new ArrayList<Book>();
        for (Book book : books) {
            if (book.year()==year) {
                foundByYear.add(book);
            }
        }
        
        return foundByYear;
    }
    
}
