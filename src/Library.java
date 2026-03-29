import java.util.ArrayList;
import java.util.List;

public class Library {

    private String libraryName;
    private List<Book> books;

    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public String listBooks() {
        String result = "List of books in " + libraryName + " library:\n";

        for (Book book : books) {
            result += book.getInfo() + "\n";
        }

        return result;
    }

    public List<Book> findBooksByAuthor(String authorName) {
        List<Book> foundBooks = new ArrayList<>();

        for (Book book : books) {
            Author author = book.getAuthor();
            if (author != null && author.getName() == authorName) {
                foundBooks.add(book);
            }
        }

        return foundBooks;
    }
}