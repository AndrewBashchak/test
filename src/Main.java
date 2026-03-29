public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Andrew Bashchak",2006);
        Author author2 = new Author("Dmytro Svitlyk",2006);

        Book book1 = new Book("How to scam people", author1, 2020, "Pages are empty");
        Book book2 = new Book("Tactics for throwing smoke grenades in CS2", author2, 2025, "");
        Book book3 = new Book("Phrases taken out of context", 2026, "");

        Library library = new Library("Easy Ainur");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        System.out.println(library.listBooks());

        System.out.println("Result of search by name: ");
        for (Book b : library.findBooksByAuthor("Andrew Bashchak")) {
            System.out.println(b.getInfo());
        }
    }
}
