package FinalProjectOOP;

import java.util.ArrayList;

public class Order {

    private int orderId;
    private Customer customer;

    private ArrayList<FoodItem> foodItems =
            new ArrayList<>();

    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
    }

    public void addFoodItem(FoodItem item) {
        foodItems.add(item);
    }

    public double calculateTotal() {

        double total = 0;

        for(FoodItem item : foodItems) {
            total += item.getPrice();
        }

        return total;
    }

    public void displayOrder() {

        System.out.println("\n===== ORDER SUMMARY =====");

        for (FoodItem item : foodItems) {

            System.out.println(
                    item.getFoodName() +
                    " - ₱" +
                    item.getPrice()
            );
        }

        System.out.println("--------------------------");
        System.out.println("TOTAL: ₱" + calculateTotal());
    }
    
    public void removeFoodItem(String foodName) {

        for (int i = 0; i < foodItems.size(); i++) {

            if (foodItems.get(i).getFoodName()
                    .equalsIgnoreCase(foodName)) {

                foodItems.remove(i);

                System.out.println(foodName + " removed from order.");
                return;
            }
        }

        System.out.println("Item not found.");
    }
}