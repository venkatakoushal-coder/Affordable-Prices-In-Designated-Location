package dsa;

public class Deal implements Comparable<Deal> {

    String store;
    String location;
    int price;

    public Deal(String store, String location, int price) {
        this.store = store;
        this.location = location;
        this.price = price;
    }

    @Override
    public int compareTo(Deal other) {
        return Integer.compare(this.price, other.price);
    }

    @Override
    public String toString() {
        return String.format("  %-22s | %-15s | ₹%,d", store, location, price);
    }
}
