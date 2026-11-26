package FinalProjectOOP;

public class CardPayment implements Payment {

    @Override
    public void pay(double amount) {

        System.out.println(
                "Card Payment Processed: ₱" + amount
        );
    }
}
