import java.util.*;

public class Book {

    private String isbn;
    private String title;
    private String author;

    private Book(BookBuilder bookBuilder) {
        this.isbn = bookBuilder.isbn;
        this.title = bookBuilder.title;
        this.author = bookBuilder.author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public static class BookBuilder {
        private String isbn;
        private String title;
        private String author = "";

        public BookBuilder(String isbn, String title) {
            this.isbn = isbn;
            this.title = title;
        }

        public BookBuilder setIsbn(String isbn) {
            this.isbn = isbn;
            return this;
        }

        public BookBuilder setTitle(String title) {
            this.title = title;
            return this;
        }

        public BookBuilder setAuthor(String author) {
            this.author = author;
            return this;
        }

        public Book build() {
            return new Book(this);
        }

    }

    public static BookBuilder builder(String isbn, String title) {
        return new BookBuilder(isbn, title);
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
