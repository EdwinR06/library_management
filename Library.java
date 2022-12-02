import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private String name;
    private int booksCapacity;

    public Library(String name) {
        this.books = new ArrayList<Book>();
        this.name = name;
        this.booksCapacity = 1000;
    }

    public Library(String name, int booksCapacity) {
        this.books = new ArrayList<Book>();
        this.name = name;
        this.booksCapacity = booksCapacity;
    }

}
