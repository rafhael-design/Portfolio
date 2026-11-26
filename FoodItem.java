package FinalProjectOOP;

public class FoodItem {

    private int foodId;
    private String foodName;
    private double price;

    public FoodItem(int foodId, String foodName, double price) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.price = price;
    }

    public int getFoodId() {
        return foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayFood() {
        System.out.println(
                foodId + " - " +
                foodName + " - ₱" +
                price
        );
    }
}