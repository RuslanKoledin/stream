package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TaskStream3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> stream = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println("четные числа :" + stream);
    }
}
