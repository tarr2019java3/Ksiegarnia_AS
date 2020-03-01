package pl.sda.ksiegarnia;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Cathegory horror = new Cathegory("Horror");
        Cathegory fantasy = new Cathegory("Fantasy");
        Cathegory scifi = new Cathegory("Science-Fiction");

        Author sapek = new Author("Andrzej", "Sapkowski");
        Author king = new Author("Stephen", "King");
        Author alien = new Author("E.", "T.");

        Book book1 = new Book("Wiedzmin", sapek, fantasy);
        Book book2 = new Book("Zło wcielone", king, horror);
        Book book3 = new Book("My one-way to home", alien, scifi);

        List<Book> books = new ArrayList<>();

        books.add(book1);
        books.add(book2);
        books.add(book3);

        JSONUtils jutils = new JSONUtils();

        jutils.writeBookList("BookList.json", books);
        jutils.readBookList("BookList.json");

    }
}
