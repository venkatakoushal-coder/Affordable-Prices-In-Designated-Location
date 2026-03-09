
package dsa;
import java.util.ArrayList;

public class Product {

    String name;
    ArrayList<Deal> deals;

    public Product(String name) {
        this.name = name;
        deals = new ArrayList<>();
    }

    public void addDeal(Deal deal) {
        deals.add(deal);
    }
}
