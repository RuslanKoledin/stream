package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TaskStream8 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> stream = numbers.stream().max(Integer::compare);

        if (stream.isPresent()) {
            System.out.println(stream.get());
        }

    }
}
