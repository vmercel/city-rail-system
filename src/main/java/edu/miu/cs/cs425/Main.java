package edu.miu.cs.cs425;

import edu.miu.cs.cs425.model.Publisher;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Sample data for 3 publishers
        List<Publisher> publishers = Arrays.asList(
                new Publisher("Penguin Books", "123 Main St, NY", "555-0101"),
                new Publisher("Oxford Press", "456 Oak Ave, CA", "555-0102"),
                new Publisher("HarperCollins", "789 Pine Rd, TX", "555-0103")
        );

        // Print publishers to console
        System.out.println("Library Publishers:");
        for (Publisher p : publishers) {
            System.out.println(p);
        }
    }
}
