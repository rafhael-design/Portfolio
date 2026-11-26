package FinalProjectOOP;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("WELCOME TO ONLINE ORDERING SYSTEM");
        System.out.println("====================================");
        System.out.println("Please pick what you would like to order.\n");

        Customer customer =
                new Customer(
                        1001,
                        "Juan Dela Cruz",
                        "San Pablo City"
                );

        Order order = new Order(1, customer);

        // APPETIZERS
        FoodItem lumpia =
                new FoodItem(1, "Lumpiang Shanghai", 80);

        FoodItem calamares =
                new FoodItem(2, "Calamares", 120);

        FoodItem fFries =
                new FoodItem(3, "French Fries", 50);

        // MAIN DISHES
        FoodItem chickenAdobo =
                new FoodItem(4, "Chicken Adobo with Rice", 150);

        FoodItem porkSinigang =
                new FoodItem(5, "Pork Sinigang with Rice", 180);

        FoodItem beefSteak =
                new FoodItem(6, "Beef Steak with Rice", 200);

        // DESSERTS
        FoodItem haloHalo =
                new FoodItem(7, "Halo-Halo", 95);

        FoodItem lecheFlan =
                new FoodItem(8, "Leche Flan", 75);

        FoodItem mangoFloat =
                new FoodItem(9, "Mango Float", 85);

        // DRINKS
        FoodItem coke =
                new FoodItem(10, "Coca-Cola", 45);

        FoodItem icedTea =
                new FoodItem(11, "Iced Tea", 40);

        FoodItem water =
                new FoodItem(12, "Mineral Water", 25);

        int choice;

        // APPETIZER

        System.out.println("\n===== APPETIZER =====");
        System.out.println("1. Lumpiang Shanghai - ₱80");
        System.out.println("2. Calamares - ₱120");
        System.out.println("3. French Fries - ₱50");
        System.out.print("Select: ");

        choice = sc.nextInt();

        switch(choice) {

            case 1:
                order.addFoodItem(lumpia);
                break;

            case 2:
                order.addFoodItem(calamares);
                break;

            case 3:
                order.addFoodItem(fFries);
                break;
        }

        // MAIN DISH

        System.out.println("\n===== MAIN DISH =====");
        System.out.println("1. Chicken Adobo with Rice - ₱150");
        System.out.println("2. Pork Sinigang with Rice - ₱180");
        System.out.println("3. Beef Steak with Rice - ₱200");
        System.out.print("Select: ");

        choice = sc.nextInt();

        switch(choice) {

            case 1:
                order.addFoodItem(chickenAdobo);
                break;

            case 2:
                order.addFoodItem(porkSinigang);
                break;

            case 3:
                order.addFoodItem(beefSteak);
                break;
        }

        // DESSERT

        System.out.println("\n===== DESSERT =====");
        System.out.println("1. Halo-Halo - ₱95");
        System.out.println("2. Leche Flan - ₱75");
        System.out.println("3. Mango Float - ₱85");
        System.out.print("Select: ");

        choice = sc.nextInt();

        switch(choice) {

            case 1:
                order.addFoodItem(haloHalo);
                break;

            case 2:
                order.addFoodItem(lecheFlan);
                break;

            case 3:
                order.addFoodItem(mangoFloat);
                break;
        }

        // DRINKS

        System.out.println("\n===== DRINKS =====");
        System.out.println("1. Coca-Cola - ₱45");
        System.out.println("2. Iced Tea - ₱40");
        System.out.println("3. Mineral Water - ₱25");
        System.out.print("Select: ");

        choice = sc.nextInt();

        switch(choice) {

            case 1:
                order.addFoodItem(coke);
                break;

            case 2:
                order.addFoodItem(icedTea);
                break;

            case 3:
                order.addFoodItem(water);
                break;
        }

        // ORDER SUMMARY

        order.displayOrder();

        int confirmChoice;

        System.out.println("\n=================================");
        System.out.println("ARE YOU SURE WITH YOUR ORDER?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.print("Choice: ");

        confirmChoice = sc.nextInt();

        while (confirmChoice == 2) {

            System.out.println("\nDo you want to add or remove something?");
            System.out.println("1. Add");
            System.out.println("2. Remove");
            System.out.println("3. Proceed to Payment");
            System.out.print("Choice: ");

            int modifyChoice = sc.nextInt();

            switch (modifyChoice) {

                case 1:

                    System.out.println("\n===== ADD ITEM =====");
                    System.out.println("1. Lumpiang Shanghai");
                    System.out.println("2. Calamares");
                    System.out.println("3. French Fries");
                    System.out.println("4. Chicken Adobo with Rice");
                    System.out.println("5. Pork Sinigang with Rice");
                    System.out.println("6. Beef Steak with Rice");
                    System.out.println("7. Halo-Halo");
                    System.out.println("8. Leche Flan");
                    System.out.println("9. Mango Float");
                    System.out.println("10. Coca-Cola");
                    System.out.println("11. Iced Tea");
                    System.out.println("12. Mineral Water");

                    int addChoice = sc.nextInt();

                    switch(addChoice) {

                        case 1: order.addFoodItem(lumpia); break;
                        case 2: order.addFoodItem(calamares); break;
                        case 3: order.addFoodItem(fFries); break;
                        case 4: order.addFoodItem(chickenAdobo); break;
                        case 5: order.addFoodItem(porkSinigang); break;
                        case 6: order.addFoodItem(beefSteak); break;
                        case 7: order.addFoodItem(haloHalo); break;
                        case 8: order.addFoodItem(lecheFlan); break;
                        case 9: order.addFoodItem(mangoFloat); break;
                        case 10: order.addFoodItem(coke); break;
                        case 11: order.addFoodItem(icedTea); break;
                        case 12: order.addFoodItem(water); break;
                    }

                    System.out.println("Item added successfully.");
                    order.displayOrder();
                    break;

                case 2:

                    sc.nextLine();

                    System.out.print("Enter item name to remove: ");

                    String removeItem = sc.nextLine();

                    order.removeFoodItem(removeItem);

                    order.displayOrder();

                    break;

                case 3:

                    confirmChoice = 1;
                    break;

                default:

                    System.out.println("Invalid Choice.");
            }
        }

        // PAYMENT

        System.out.println("\n===== PAYMENT =====");
        System.out.println("1. Cash");
        System.out.println("2. Card");
        System.out.print("Choose Payment Method: ");

        int paymentChoice = sc.nextInt();

        Payment payment;

        if (paymentChoice == 1) {
            payment = new CashPayment();
        } else {
            payment = new CardPayment();
        }

        payment.pay(order.calculateTotal());

        System.out.println("\n================================");
        System.out.println("ORDER SUCCESSFUL!");
        System.out.println("THANK YOU FOR DINING WITH US!");
        System.out.println("================================");

        sc.close();
    }
}