package pl.sda.ksiegarnia;

public class Book {

    private String name;
    private Author author;
    private Cathegory cathegory;

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public Cathegory getCathegory() {
        return cathegory;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setCathegory(Cathegory cathegory) {
        this.cathegory = cathegory;
    }

    public Book(String name, Author author, Cathegory cathegory) {
        this.name = name;
        this.author = author;
        this.cathegory = cathegory;
    }

    public Book() {
    }
}
