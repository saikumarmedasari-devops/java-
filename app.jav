public class Order {

    int orderId;
    String customerName;
    String productName;
    double price;
    String status;

    public Order(int orderId, String customerName,
                 String productName, double price) {

        this.orderId = orderId;
        this.customerName = customerName;
        this.productName = productName;
        this.price = price;
        this.status = "CREATED";
    }

    public void displayOrder() {

        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customerName);
        System.out.println("Product: " + productName);
        System.out.println("Price: £" + price);
        System.out.println("Status: " + status);
    }

    public static void main(String[] args) {

        Order order = new Order(
            101,
            "Saikumar",
            "MacBook Pro",
            1500
        );

        order.displayOrder();
    }
}
