public class OrderService {

    public String createOrder(
            String customerName,
            String productName,
            double price) {

        if (customerName == null || customerName.isBlank()) {
            throw new IllegalArgumentException(
                "Customer name is required"
            );
        }

        if (productName == null || productName.isBlank()) {
            throw new IllegalArgumentException(
                "Product name is required"
            );
        }

        if (price <= 0) {
            throw new IllegalArgumentException(
                "Price must be greater than zero"
            );
        }

        return "Order created successfully";
    }
}
