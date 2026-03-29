public class Author {

    private String name;
    private int birthYear;

    public Author(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return "Author's name: " + name + ", Year of birth: " + birthYear;
    }
}
