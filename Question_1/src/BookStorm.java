import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class BookStorm {

    private static Map<String, Book> bookstore = new HashMap<String, Book>();

    public Collection<Book> findAllBooks() {
        return bookstore.values();
    }


    public Book findBookByIsbn(String isbn) {
        return bookstore.get(isbn);
    }

    public void add(Book book) {
        bookstore.put(book.getIsbn(), book);
    }

    public void delete(String isbn) {

        bookstore.remove(isbn);
    }


    public void update(String isbn, Book book) {
        bookstore.replace(isbn, book);
    }
}
