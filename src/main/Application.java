
package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main entry point for the Order Management application.
 */
@SpringBootApplication
public class Application {

    /**
     * Private constructor prevents unnecessary instantiation.
     */
    private Application() {
        // Utility constructor.
    }

    /**
     * Starts the Spring Boot application.
     *
     * @param args command-line arguments
     */
    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
