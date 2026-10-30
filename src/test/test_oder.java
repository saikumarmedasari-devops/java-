import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceTest {

    OrderService service = new OrderService();

    @Test
    void shouldCreateOrderSuccessfully() {

        String result = service.createOrder(
            "Saikumar",
            "MacBook",
            1500
        );

        assertEquals(
            "Order created successfully",
            result
        );
    }

    @Test
    void shouldRejectEmptyCustomerName() {

        assertThrows(
            IllegalArgumentException.class,
            () -> service.createOrder("", "MacBook", 1500)
        );
    }

    @Test
    void shouldRejectNegativePrice() {

        assertThrows(
            IllegalArgumentException.class,
            () -> service.createOrder("Saikumar", "MacBook", -100)
        );
    }

    @Test
    void shouldRejectEmptyProductName() {

        assertThrows(
            IllegalArgumentException.class,
            () -> service.createOrder("Saikumar", "", 1500)
        );
    }
}
