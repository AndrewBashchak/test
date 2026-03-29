public class Book{

    private String title;
    private Author author;
    private int year;
    private String annotation;

    public Book(String title, Author author, int year, String annotation) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.annotation = annotation;
    }

    public Book(String title, int year, String annotation) {
        this(title, null, year, annotation);
    }

    public Author getAuthor() {
        return author;
    }

    public String getInfo() {
        String authorInfo = (author == null) ? "Author: unknown" : author.getInfo();
        return "Title: " + title +
               ", " + authorInfo +
               ", Year of publication: " + year +
               ", Annotation: " + annotation;
    }
}
