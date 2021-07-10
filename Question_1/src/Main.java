import java.util.Collection;

public class Main {

    public static void main(String[] args) {
        BookStorm bookStorm = new BookStorm();

        Book book1 = Book.builder("123", "test1").setAuthor("ali").build();
        Book book2 = Book.builder("456", "test2").setAuthor("hesam").build();
        Book book3 = Book.builder("789", "test3").setAuthor("reza").build();
        Book book4 = Book.builder("012", "test4").setAuthor("reza").build();


        bookStorm.add(book1);
        bookStorm.add(book2);
        bookStorm.add(book4);


        bookStorm.update(book2.getIsbn(), book3);
        bookStorm.delete("book3");
        Collection<Book> books = bookStorm.findAllBooks();

        System.out.println(books);
        Book selctBook = bookStorm.findBookByIsbn("123");
        System.out.println(selctBook);

    }
}
