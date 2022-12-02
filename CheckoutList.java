import java.util.ArrayList;
import java.util.Date;

public class CheckoutList {
    private String name; 
    private ArrayList<Book> books;
    private int date;

    public CheckoutList(String name, Library library) {
        this.name = name;
        this.books = new ArrayList<Book>();
        this.date = library.getDate();
    }

    public String getName() {
        return name;
    }

    public int getDate() {
        return date;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void returnBooks() {
        for(int i = 0; i < books.size(); i++) {
            books.get(i).setCheckedOut(false);
            books.get(i).setIsMissing(false);
        }
    }

}
