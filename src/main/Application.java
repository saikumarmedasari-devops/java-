

package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main entry point for the Order Management application.
 */
@SpringBootApplication
public final class Application {

    /**
     * Private constructor prevents unnecessary instantiation.
     */
    private Application() {
        // Prevent instantiation.
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
