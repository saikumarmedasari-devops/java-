
package com.example;

import org.springframework.stereotype.Service;

/**
 * Service responsible for validating and creating customer orders.
 */
@Service
public final class OrderService {

    /**
     * Validates order details and creates an order.
     *
     * @param customerName the customer's name
     * @param productName the product being ordered
     * @param price the order price
     * @return confirmation message
     * @throws IllegalArgumentException if order details are invalid
     */
    public String createOrder(
            final String customerName,
            final String productName,
            final double price) {

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
