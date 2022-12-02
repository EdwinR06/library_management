import java.util.ArrayList;
import java.util.Date;

public class CheckoutList {
    private String name; 
    private ArrayList<Book> books;
    private int date;
    private boolean hasBeenReturned;

    public CheckoutList(String name, Library library) {
        this.name = name;
        this.books = new ArrayList<Book>();
        this.date = library.getDate();
        this.hasBeenReturned = false;
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

    public boolean hasBeenReturned() {
        return hasBeenReturned;
    }

    public void returnBooks() {
        for(int i = 0; i < books.size(); i++) {
            books.get(i).setCheckedOut(false);
            books.get(i).setIsMissing(false);
        }
        hasBeenReturned = true;
    }

}
