package solid_principles.interface_segregation;

public class Waiter implements RestaurantEmployee{

    @Override
    public void washDishes() {
        System.out.println("This is not my Job.");
    }

    @Override
    public void serveCustomers() {
        System.out.println("Serving the customer");
    }

    @Override
    public void cookFood() {
        System.out.println("This is not my Job.");

    }
}
