package dsa;
import java.util.*;

public class PriceRecommender {

    HashMap<String, Product> products;

    public PriceRecommender() {
        products = new HashMap<>();
    }

    // Add product deal
    public void addProductDeal(String productName, String store, String location, int price) {

        productName = productName.toLowerCase();

        products.putIfAbsent(productName, new Product(productName));

        Product product = products.get(productName);

        product.addDeal(new Deal(store, location, price));
    }

    // Find lowest price
    public Deal findLowestPrice(String productName, String location) {

        productName = productName.toLowerCase();

        if (!products.containsKey(productName)) {
            return null;
        }

        Product product = products.get(productName);

        PriorityQueue<Deal> minHeap =
                new PriorityQueue<>(Comparator.comparingInt(d -> d.price));

        for (Deal d : product.deals) {
            if (d.location.equalsIgnoreCase(location)) {
                minHeap.add(d);
            }
        }

        if (minHeap.isEmpty()) return null;

        return minHeap.poll();
    }
}