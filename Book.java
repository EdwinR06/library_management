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

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public String getAuthor() {
        return author;
    }

    public boolean getCheckedOut() {
        return checkedOut;
    }

    public boolean getIsMissing() {
        return isMissing;
    }

    public Date getLastDateCheckedOut(){
        return lastDateCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }

    public void setIsMissing(boolean isMissing) {
        this.isMissing = isMissing;
    }

    public void setLastDateCheckedOut(Date date) {
        this.lastDateCheckedOut = date;
    }

}
