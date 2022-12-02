import java.util.Date;
public class Book {
    private String title;
    private boolean checkedOut;
    private boolean isMissing;
    private int pages;
    private String author;
    private Date lastDateCheckedOut;

    public Book(String title, int pages, String author) {
        this.title = title;
        this.checkedOut = false;
        this.isMissing = false;
        this.pages = pages;
        this.author = author;
        this.lastDateCheckedOut = null;
    }

    
}
