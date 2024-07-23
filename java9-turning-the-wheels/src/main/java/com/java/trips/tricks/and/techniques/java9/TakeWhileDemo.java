package com.java.trips.tricks.and.techniques.java9;

import java.util.Arrays;
import java.util.List;

public class TakeWhileDemo {

    public static void main(String[] args) {
        List<Product> products = Arrays.asList(new Product("Denim Jeans", "Garment", 1500.00), new Product("T shirt", "Garment", 500.00),
                new Product("Nike", "Sports", 400.00), new Product("Kurtis", "Garment", 150.00));

        products.stream().takeWhile(e -> e.getProductCategory().equals("Garment")).forEach(System.out::println);

    }
}
