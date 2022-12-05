import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<CheckoutList> checkoutHistory;
    private String name;
    private int booksCapacity;
    private Calendar calendar;
    private ArrayList<User> users;

    public Library(String name) {
        this.books = new ArrayList<Book>();
        this.checkoutHistory = new ArrayList<CheckoutList>();
        this.name = name;
        this.booksCapacity = 1000;
        this.calendar = Calendar.getInstance(TimeZone.getDefault(), new Locale("EN", "US"));
        this.users = new ArrayList<User>();
    }

    public Library(String name, int booksCapacity) {
        this.books = new ArrayList<Book>();
        this.name = name;
        this.booksCapacity = booksCapacity;
    }

    public int getDate() {
        return calendar.DATE;
    }

    public void returnBooks(String name) {
        for(int i = 0; i < checkoutHistory.size(); i++) {
            if(checkoutHistory.get(i).getName().equals(name)) {
                checkoutHistory.get(i).returnBooks();
            }
        }
    }

    private boolean isBookCheckedOut(Book book) {
        boolean availableStatus;
        if(book.getCheckedOut() || book.getIsMissing()) {
            availableStatus = false;
        } else {
            availableStatus = true;
        }
        return availableStatus;
    }

    public void checkoutBooks(String customerName, ArrayList<Book> books) {
        CheckoutList checkout = new CheckoutList(customerName, this);
        for(int i = 0; i < books.size(); i++){
            if(!isBookCheckedOut(books.get(i))){
                checkout.addBook(books.get(i));
                books.get(i).setCheckedOut(true);
            }
        }
    }

}
