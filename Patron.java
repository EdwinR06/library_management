import java.util.ArrayList;

public class Patron extends User {
    private ArrayList<CheckoutList> checkoutHistory;

    public Patron(String username, String password) {
        super(username, password);
        this.checkoutHistory = new ArrayList<CheckoutList>();
    }

    public void setCheckoutHistory(ArrayList<CheckoutList> checkoutHistory) {
        this.checkoutHistory = checkoutHistory;
    }

    public ArrayList<CheckoutList> getCheckoutHistory() {
        return checkoutHistory;
    }
}
