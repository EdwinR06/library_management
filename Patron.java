import java.util.ArrayList;

public class Patron extends User {
    private ArrayList<CheckoutList> checkoutHistory;

    public void setCheckoutHistory(ArrayList<CheckoutList> checkoutHistory) {
        this.checkoutHistory = checkoutHistory;
    }

    public ArrayList<CheckoutList> getCheckoutHistory() {
        return checkoutHistory;
    }
}
