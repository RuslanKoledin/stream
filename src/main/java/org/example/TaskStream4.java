package org.example;

import java.util.Arrays;
import java.util.List;

public class TaskStream4 {
    public static void main(String[] args) {
//        Проверить, содержит ли список число 3:
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        boolean stream = numbers.stream().anyMatch(a -> a == 3);
        System.out.println(stream);
    }
}
