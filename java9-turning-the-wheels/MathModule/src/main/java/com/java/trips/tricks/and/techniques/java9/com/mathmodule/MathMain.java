package com.java.trips.tricks.and.techniques.java9.com.mathmodule;

import com.java.trips.tricks.and.techniques.java9.com.mathmoduleservice.MathService;

import java.util.Arrays;
import java.util.List;

/**
 * This will print all the elements of the arraylist which are divisible by 2.
 */
public class MathMain {

    public static void main(String[] args) {
        List<Integer> generateList = MathService.checNumbers(Arrays.asList(10,20,35,40), 2);
        generateList.forEach(System.out::println);
    }
}
