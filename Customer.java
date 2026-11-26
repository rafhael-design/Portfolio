package FinalProjectOOP;

public class Customer extends Person {

    private String address;

    public Customer(int id, String name, String address) {
        super(id, name);
        this.address = address;
    }

    @Override
    public void displayInfo() {

        System.out.println("\nCustomer Details");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }
}
