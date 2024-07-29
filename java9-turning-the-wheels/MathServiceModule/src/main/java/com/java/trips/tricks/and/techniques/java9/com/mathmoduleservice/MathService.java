package com.java.trips.tricks.and.techniques.java9.com.mathmoduleservice;

import java.util.ArrayList;
import java.util.List;

public class MathService {
    /**
     *
     * @param numbers
     * @param value
     * @return
     *          a list of numbers which are divisible by 2
     */
    public static List<Integer> checNumbers(List<Integer> numbers, int value) {

        List<Integer>  numberList = new ArrayList<>();

        numbers.forEach( x ->{

            if( x % value == 0 ) {

                numberList.add(x);
            }

        });

        return numberList;
    }
}
