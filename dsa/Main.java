package dsa;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PriceRecommender system = new PriceRecommender();

        // ── Sample Data ──────────────────────────────────────────
        // 8 Products × 3 Locations × 5 Stores each

        // 1. Samsung Galaxy S21
        system.addProductDeal("Samsung Galaxy S21", "Reliance Digital", "Secunderabad", 41500);
        system.addProductDeal("Samsung Galaxy S21", "Croma",            "Secunderabad", 42000);
        system.addProductDeal("Samsung Galaxy S21", "Poorvika",         "Secunderabad", 41000);
        system.addProductDeal("Samsung Galaxy S21", "Vijay Sales",      "Secunderabad", 41200);
        system.addProductDeal("Samsung Galaxy S21", "Sangeetha",        "Secunderabad", 42500);

        system.addProductDeal("Samsung Galaxy S21", "Reliance Digital", "Kukatpally",   41800);
        system.addProductDeal("Samsung Galaxy S21", "Croma",            "Kukatpally",   42800);
        system.addProductDeal("Samsung Galaxy S21", "Poorvika",         "Kukatpally",   42000);
        system.addProductDeal("Samsung Galaxy S21", "Vijay Sales",      "Kukatpally",   41600);
        system.addProductDeal("Samsung Galaxy S21", "Sangeetha",        "Kukatpally",   43000);

        system.addProductDeal("Samsung Galaxy S21", "Reliance Digital", "Ameerpet",     42500);
        system.addProductDeal("Samsung Galaxy S21", "Croma",            "Ameerpet",     43200);
        system.addProductDeal("Samsung Galaxy S21", "Poorvika",         "Ameerpet",     41900);
        system.addProductDeal("Samsung Galaxy S21", "Vijay Sales",      "Ameerpet",     42100);
        system.addProductDeal("Samsung Galaxy S21", "Sangeetha",        "Ameerpet",     43500);

        // 2. iPhone 14
        system.addProductDeal("iPhone 14", "iStore",           "Secunderabad", 71000);
        system.addProductDeal("iPhone 14", "Croma",            "Secunderabad", 73500);
        system.addProductDeal("iPhone 14", "Reliance Digital", "Secunderabad", 72000);
        system.addProductDeal("iPhone 14", "Vijay Sales",      "Secunderabad", 71800);
        system.addProductDeal("iPhone 14", "Poorvika",         "Secunderabad", 72500);

        system.addProductDeal("iPhone 14", "iStore",           "Kukatpally",   71500);
        system.addProductDeal("iPhone 14", "Croma",            "Kukatpally",   74000);
        system.addProductDeal("iPhone 14", "Reliance Digital", "Kukatpally",   72800);
        system.addProductDeal("iPhone 14", "Vijay Sales",      "Kukatpally",   71200);
        system.addProductDeal("iPhone 14", "Poorvika",         "Kukatpally",   73000);

        system.addProductDeal("iPhone 14", "iStore",           "Ameerpet",     72000);
        system.addProductDeal("iPhone 14", "Croma",            "Ameerpet",     74500);
        system.addProductDeal("iPhone 14", "Reliance Digital", "Ameerpet",     73000);
        system.addProductDeal("iPhone 14", "Vijay Sales",      "Ameerpet",     71900);
        system.addProductDeal("iPhone 14", "Poorvika",         "Ameerpet",     72200);

        // 3. HP Pavilion
        system.addProductDeal("HP Pavilion", "Croma",            "Secunderabad", 62000);
        system.addProductDeal("HP Pavilion", "Reliance Digital", "Secunderabad", 63500);
        system.addProductDeal("HP Pavilion", "Vijay Sales",      "Secunderabad", 61500);
        system.addProductDeal("HP Pavilion", "Poorvika",         "Secunderabad", 62800);
        system.addProductDeal("HP Pavilion", "Sangeetha",        "Secunderabad", 64000);

        system.addProductDeal("HP Pavilion", "Croma",            "Kukatpally",   61000);
        system.addProductDeal("HP Pavilion", "Reliance Digital", "Kukatpally",   62500);
        system.addProductDeal("HP Pavilion", "Vijay Sales",      "Kukatpally",   60500);
        system.addProductDeal("HP Pavilion", "Poorvika",         "Kukatpally",   61800);
        system.addProductDeal("HP Pavilion", "Sangeetha",        "Kukatpally",   63000);

        system.addProductDeal("HP Pavilion", "Croma",            "Ameerpet",     62500);
        system.addProductDeal("HP Pavilion", "Reliance Digital", "Ameerpet",     64000);
        system.addProductDeal("HP Pavilion", "Vijay Sales",      "Ameerpet",     61200);
        system.addProductDeal("HP Pavilion", "Poorvika",         "Ameerpet",     62000);
        system.addProductDeal("HP Pavilion", "Sangeetha",        "Ameerpet",     63500);

        // 4. Sony WH-1000XM5 (Headphones)
        system.addProductDeal("Sony WH-1000XM5", "Croma",            "Secunderabad", 28500);
        system.addProductDeal("Sony WH-1000XM5", "Reliance Digital", "Secunderabad", 29000);
        system.addProductDeal("Sony WH-1000XM5", "Vijay Sales",      "Secunderabad", 27800);
        system.addProductDeal("Sony WH-1000XM5", "Poorvika",         "Secunderabad", 28000);
        system.addProductDeal("Sony WH-1000XM5", "Sangeetha",        "Secunderabad", 29500);

        system.addProductDeal("Sony WH-1000XM5", "Croma",            "Kukatpally",   28000);
        system.addProductDeal("Sony WH-1000XM5", "Reliance Digital", "Kukatpally",   28800);
        system.addProductDeal("Sony WH-1000XM5", "Vijay Sales",      "Kukatpally",   27500);
        system.addProductDeal("Sony WH-1000XM5", "Poorvika",         "Kukatpally",   27900);
        system.addProductDeal("Sony WH-1000XM5", "Sangeetha",        "Kukatpally",   29200);

        system.addProductDeal("Sony WH-1000XM5", "Croma",            "Ameerpet",     28200);
        system.addProductDeal("Sony WH-1000XM5", "Reliance Digital", "Ameerpet",     29100);
        system.addProductDeal("Sony WH-1000XM5", "Vijay Sales",      "Ameerpet",     27600);
        system.addProductDeal("Sony WH-1000XM5", "Poorvika",         "Ameerpet",     28100);
        system.addProductDeal("Sony WH-1000XM5", "Sangeetha",        "Ameerpet",     29800);

        // 5. Dell Inspiron 15
        system.addProductDeal("Dell Inspiron 15", "Croma",            "Secunderabad", 55000);
        system.addProductDeal("Dell Inspiron 15", "Reliance Digital", "Secunderabad", 56500);
        system.addProductDeal("Dell Inspiron 15", "Vijay Sales",      "Secunderabad", 54000);
        system.addProductDeal("Dell Inspiron 15", "Poorvika",         "Secunderabad", 55500);
        system.addProductDeal("Dell Inspiron 15", "Sangeetha",        "Secunderabad", 57000);

        system.addProductDeal("Dell Inspiron 15", "Croma",            "Kukatpally",   54500);
        system.addProductDeal("Dell Inspiron 15", "Reliance Digital", "Kukatpally",   56000);
        system.addProductDeal("Dell Inspiron 15", "Vijay Sales",      "Kukatpally",   53500);
        system.addProductDeal("Dell Inspiron 15", "Poorvika",         "Kukatpally",   55000);
        system.addProductDeal("Dell Inspiron 15", "Sangeetha",        "Kukatpally",   56800);

        system.addProductDeal("Dell Inspiron 15", "Croma",            "Ameerpet",     55200);
        system.addProductDeal("Dell Inspiron 15", "Reliance Digital", "Ameerpet",     57000);
        system.addProductDeal("Dell Inspiron 15", "Vijay Sales",      "Ameerpet",     54200);
        system.addProductDeal("Dell Inspiron 15", "Poorvika",         "Ameerpet",     55800);
        system.addProductDeal("Dell Inspiron 15", "Sangeetha",        "Ameerpet",     57500);

        // 6. Canon EOS 1500D (Camera)
        system.addProductDeal("Canon EOS 1500D", "Croma",            "Secunderabad", 34000);
        system.addProductDeal("Canon EOS 1500D", "Reliance Digital", "Secunderabad", 35500);
        system.addProductDeal("Canon EOS 1500D", "Vijay Sales",      "Secunderabad", 33000);
        system.addProductDeal("Canon EOS 1500D", "Poorvika",         "Secunderabad", 33800);
        system.addProductDeal("Canon EOS 1500D", "Sangeetha",        "Secunderabad", 35000);

        system.addProductDeal("Canon EOS 1500D", "Croma",            "Kukatpally",   33500);
        system.addProductDeal("Canon EOS 1500D", "Reliance Digital", "Kukatpally",   35000);
        system.addProductDeal("Canon EOS 1500D", "Vijay Sales",      "Kukatpally",   32500);
        system.addProductDeal("Canon EOS 1500D", "Poorvika",         "Kukatpally",   33200);
        system.addProductDeal("Canon EOS 1500D", "Sangeetha",        "Kukatpally",   34500);

        system.addProductDeal("Canon EOS 1500D", "Croma",            "Ameerpet",     34200);
        system.addProductDeal("Canon EOS 1500D", "Reliance Digital", "Ameerpet",     35800);
        system.addProductDeal("Canon EOS 1500D", "Vijay Sales",      "Ameerpet",     33100);
        system.addProductDeal("Canon EOS 1500D", "Poorvika",         "Ameerpet",     34000);
        system.addProductDeal("Canon EOS 1500D", "Sangeetha",        "Ameerpet",     35200);

        // 7. LG 43-inch Smart TV
        system.addProductDeal("LG 43 Smart TV", "Croma",            "Secunderabad", 32000);
        system.addProductDeal("LG 43 Smart TV", "Reliance Digital", "Secunderabad", 33500);
        system.addProductDeal("LG 43 Smart TV", "Vijay Sales",      "Secunderabad", 31000);
        system.addProductDeal("LG 43 Smart TV", "Poorvika",         "Secunderabad", 31500);
        system.addProductDeal("LG 43 Smart TV", "Sangeetha",        "Secunderabad", 33000);

        system.addProductDeal("LG 43 Smart TV", "Croma",            "Kukatpally",   31500);
        system.addProductDeal("LG 43 Smart TV", "Reliance Digital", "Kukatpally",   33000);
        system.addProductDeal("LG 43 Smart TV", "Vijay Sales",      "Kukatpally",   30500);
        system.addProductDeal("LG 43 Smart TV", "Poorvika",         "Kukatpally",   31200);
        system.addProductDeal("LG 43 Smart TV", "Sangeetha",        "Kukatpally",   32500);

        system.addProductDeal("LG 43 Smart TV", "Croma",            "Ameerpet",     32200);
        system.addProductDeal("LG 43 Smart TV", "Reliance Digital", "Ameerpet",     34000);
        system.addProductDeal("LG 43 Smart TV", "Vijay Sales",      "Ameerpet",     31000);
        system.addProductDeal("LG 43 Smart TV", "Poorvika",         "Ameerpet",     31800);
        system.addProductDeal("LG 43 Smart TV", "Sangeetha",        "Ameerpet",     33200);

        // 8. boAt Rockerz 450 (Bluetooth Headphones)
        system.addProductDeal("boAt Rockerz 450", "Croma",            "Secunderabad", 1800);
        system.addProductDeal("boAt Rockerz 450", "Reliance Digital", "Secunderabad", 1950);
        system.addProductDeal("boAt Rockerz 450", "Vijay Sales",      "Secunderabad", 1700);
        system.addProductDeal("boAt Rockerz 450", "Poorvika",         "Secunderabad", 1750);
        system.addProductDeal("boAt Rockerz 450", "Sangeetha",        "Secunderabad", 2000);

        system.addProductDeal("boAt Rockerz 450", "Croma",            "Kukatpally",   1850);
        system.addProductDeal("boAt Rockerz 450", "Reliance Digital", "Kukatpally",   1900);
        system.addProductDeal("boAt Rockerz 450", "Vijay Sales",      "Kukatpally",   1650);
        system.addProductDeal("boAt Rockerz 450", "Poorvika",         "Kukatpally",   1720);
        system.addProductDeal("boAt Rockerz 450", "Sangeetha",        "Kukatpally",   1980);

        system.addProductDeal("boAt Rockerz 450", "Croma",            "Ameerpet",     1870);
        system.addProductDeal("boAt Rockerz 450", "Reliance Digital", "Ameerpet",     1960);
        system.addProductDeal("boAt Rockerz 450", "Vijay Sales",      "Ameerpet",     1680);
        system.addProductDeal("boAt Rockerz 450", "Poorvika",         "Ameerpet",     1740);
        system.addProductDeal("boAt Rockerz 450", "Sangeetha",        "Ameerpet",     2020);
        // ─────────────────────────────────────────────────────────

        boolean running = true;

        while (running) {
            printHeader();
            System.out.println("  [1] Search cheapest deals");
            System.out.println("  [2] Browse all products & locations");
            System.out.println("  [3] Exit");
            System.out.println();
            System.out.print("  Choose an option: ");

            String choice = sc.nextLine().trim();

            switch (choice) {

                case "1":
                    handleSearch(sc, system);
                    break;

                case "2":
                    printHeader();
                    System.out.println("  AVAILABLE PRODUCTS");
                    system.browseAll();
                    pausePrompt(sc);
                    break;

                case "3":
                    System.out.println();
                    System.out.println("  Thank you for using PriceWise. Goodbye!");
                    System.out.println();
                    running = false;
                    break;

                default:
                    System.out.println("\n  ⚠  Invalid option. Please enter 1, 2, or 3.\n");
            }
        }

        sc.close();
    }

    // ── Search Handler ───────────────────────────────────────────
    private static void handleSearch(Scanner sc, PriceRecommender system) {
        printHeader();
        System.out.println("  SEARCH CHEAPEST DEALS");
        System.out.println("  " + "-".repeat(50));

        // Product input & validation
        String product;
        while (true) {
            System.out.print("\n  Enter product name: ");
            product = sc.nextLine().trim();

            if (product.isEmpty()) {
                System.out.println("  ⚠  Product name cannot be empty.");
                continue;
            }
            if (!system.productExists(product)) {
                System.out.println("  ⚠  Product \"" + product + "\" not found. Try browsing all products first.");
                pausePrompt(sc);
                return;
            }
            break;
        }

        // Location input & validation
        String location;
        while (true) {
            System.out.print("  Enter location     : ");
            location = sc.nextLine().trim();

            if (location.isEmpty()) {
                System.out.println("  ⚠  Location cannot be empty.");
                continue;
            }
            break;
        }

        // Fetch top 3 deals
        List<Deal> topDeals = system.findTopDeals(product, location, 3);
        String displayLocation = capitalizeWords(location);

        System.out.println();
        if (topDeals.isEmpty()) {
            System.out.println("  ✗  No deals found for \"" + product + "\" in " + displayLocation + ".");
            System.out.println("     Try a different location or browse available products.");
        } else {
            System.out.println("  TOP " + topDeals.size() + " CHEAPEST DEALS — " + displayLocation.toUpperCase());
            System.out.println("  " + "-".repeat(55));
            System.out.printf("  %-4s %-22s %-16s %s%n", "RANK", "STORE", "LOCATION", "PRICE");
            System.out.println("  " + "-".repeat(55));

            int rank = 1;
            for (Deal d : topDeals) {
                String medal = rank == 1 ? "🥇" : rank == 2 ? "🥈" : "🥉";
                System.out.printf("  %s   %-22s %-16s ₹%,d%n", medal, d.store, capitalizeWords(d.location), d.price);
                rank++;
            }

            System.out.println("  " + "-".repeat(55));
            System.out.println("  ✔  Best deal: " + topDeals.get(0).store + " at ₹" + String.format("%,d", topDeals.get(0).price));
        }

        System.out.println();
        pausePrompt(sc);
    }

    // ── UI Helpers ───────────────────────────────────────────────
    private static void printHeader() {
        System.out.println();
        System.out.println("  ╔══════════════════════════════════════════════╗");
        System.out.println("  ║         PRICEWISE RECOMMENDER SYSTEM         ║");
        System.out.println("  ╚══════════════════════════════════════════════╝");
        System.out.println();
    }

    private static void pausePrompt(Scanner sc) {
        System.out.print("  Press Enter to return to the menu...");
        sc.nextLine();
    }

    private static String capitalizeWords(String str) {
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String w : words) {
            if (!w.isEmpty())
                sb.append(Character.toUpperCase(w.charAt(0))).append(w.substring(1)).append(" ");
        }
        return sb.toString().trim();
    }
}
