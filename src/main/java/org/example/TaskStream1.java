package org.example;

import java.util.Arrays;
import java.util.List;

public class TaskStream1 {
    public static void main(String[] args) {


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        double avg = numbers.stream().mapToDouble(Integer::doubleValue).average().orElse(Double.NaN);
        System.out.println("avg : " + avg);
    }
}
