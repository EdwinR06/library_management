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

    public Library(String name) {
        this.books = new ArrayList<Book>();
        this.checkoutHistory = new ArrayList<CheckoutList>();
        this.name = name;
        this.booksCapacity = 1000;
        this.calendar = Calendar.getInstance(TimeZone.getDefault(), new Locale("EN", "US"));
    }

    public Library(String name, int booksCapacity) {
        this.books = new ArrayList<Book>();
        this.name = name;
        this.booksCapacity = booksCapacity;
    }

    public int getDate() {
        return calendar.DATE;
    }

}
