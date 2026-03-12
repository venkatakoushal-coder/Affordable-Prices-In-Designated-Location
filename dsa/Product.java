package dsa;

import java.util.ArrayList;

public class Product {

    String name;
    ArrayList<Deal> deals;

    public Product(String name) {
        this.name = name;
        this.deals = new ArrayList<>();
    }

    public void addDeal(Deal deal) {
        this.deals.add(deal);
    }

    // Get all unique locations for this product
    public ArrayList<String> getLocations() {
        ArrayList<String> locations = new ArrayList<>();
        for (Deal d : deals) {
            if (!locations.contains(d.location.toLowerCase())) {
                locations.add(d.location.toLowerCase());
            }
        }
        return locations;
    }
}
