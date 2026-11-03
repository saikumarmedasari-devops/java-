
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OrderServiceTest {

    private final OrderService orderService = new OrderService();

    @Test
    void shouldCreateOrderSuccessfully() {

        String result = orderService.createOrder(
            "Saikumar",
            "Laptop",
            1200.0
        );

        assertEquals("Order created successfully", result);
    }

    @Test
    void shouldRejectEmptyCustomerName() {

        assertThrows(IllegalArgumentException.class, () ->
            orderService.createOrder("", "Laptop", 1200.0)
        );
    }

    @Test
    void shouldRejectEmptyProductName() {

        assertThrows(IllegalArgumentException.class, () ->
            orderService.createOrder("Saikumar", "", 1200.0)
        );
    }

    @Test
    void shouldRejectZeroPrice() {

        assertThrows(IllegalArgumentException.class, () ->
            orderService.createOrder("Saikumar", "Laptop", 0)
        );
    }

    @Test
    void shouldRejectNegativePrice() {

        assertThrows(IllegalArgumentException.class, () ->
            orderService.createOrder("Saikumar", "Laptop", -100)
        );
    }
}
