package dsa;

import java.util.*;

public class PriceRecommender {

    HashMap<String, Product> products;

    public PriceRecommender() {
        products = new HashMap<>();
    }

    // Add a product deal
    public void addProductDeal(String productName, String store, String location, int price) {
        productName = productName.toLowerCase();
        location = location.trim().toLowerCase();
        products.putIfAbsent(productName, new Product(productName));
        Product product = products.get(productName);
        product.addDeal(new Deal(store, location, price));
    }

    // Find top N cheapest deals for a product in a location using MinHeap
    public List<Deal> findTopDeals(String productName, String location, int topN) {
        productName = productName.toLowerCase();
        location = location.trim().toLowerCase();

        List<Deal> results = new ArrayList<>();

        if (!products.containsKey(productName)) return results;

        Product product = products.get(productName);

        PriorityQueue<Deal> minHeap = new PriorityQueue<>();

        for (Deal d : product.deals) {
            if (d.location.equals(location)) {
                minHeap.add(d);
            }
        }

        int count = 0;
        while (!minHeap.isEmpty() && count < topN) {
            results.add(minHeap.poll());
            count++;
        }

        return results;
    }

    // Browse all products and their available locations
    public void browseAll() {
        if (products.isEmpty()) {
            System.out.println("  No products available.");
            return;
        }

        System.out.println("\n  " + "-".repeat(50));
        System.out.printf("  %-30s %s%n", "PRODUCT", "AVAILABLE LOCATIONS");
        System.out.println("  " + "-".repeat(50));

        // Sort product names alphabetically using TreeMap
        TreeMap<String, Product> sorted = new TreeMap<>(products);

        for (Map.Entry<String, Product> entry : sorted.entrySet()) {
            String displayName = capitalizeWords(entry.getKey());
            ArrayList<String> locations = entry.getValue().getLocations();
            Collections.sort(locations);

            System.out.printf("  %-30s %s%n", displayName, String.join(", ", locations));
        }

        System.out.println("  " + "-".repeat(50));
    }

    // Check if a product exists
    public boolean productExists(String productName) {
        return products.containsKey(productName.toLowerCase());
    }

    // Helper: capitalize each word for display
    private String capitalizeWords(String str) {
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String w : words) {
            if (!w.isEmpty())
                sb.append(Character.toUpperCase(w.charAt(0))).append(w.substring(1)).append(" ");
        }
        return sb.toString().trim();
    }
}
