package dsa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PriceRecommender system = new PriceRecommender();

        // Sample data (same as your JS project)

        system.addProductDeal("Samsung Galaxy S21", "Reliance Digital", "Secunderabad", 41500);
        system.addProductDeal("Samsung Galaxy S21", "Croma", "Secunderabad", 42000);

        system.addProductDeal("Samsung Galaxy S21", "Reliance Digital", "Kukatpally", 41800);
        system.addProductDeal("Samsung Galaxy S21", "Croma", "Kukatpally", 42800);

        system.addProductDeal("Samsung Galaxy S21", "Croma", "Ameerpet", 43200);

        system.addProductDeal("HP Pavilion", "Croma", "Kukatpally", 61000);
        system.addProductDeal("HP Pavilion", "Reliance Digital", "Secunderabad", 63500);


        System.out.println("===== PRICEWISE RECOMMENDER SYSTEM =====");

        System.out.print("Enter product name: ");
        String product = sc.nextLine();

        System.out.print("Enter location: ");
        String location = sc.nextLine();

        Deal result = system.findLowestPrice(product, location);

        if (result == null) {
            System.out.println("No deals found for this product in the given location.");
        } else {

            System.out.println("\nBest Deal Found!");
            System.out.println("Store: " + result.store);
            System.out.println("Location: " + result.location);
            System.out.println("Price: ₹" + result.price);
        }

        sc.close();
    }
}
