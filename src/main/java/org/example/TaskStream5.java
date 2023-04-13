package org.example;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TaskStream5 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("one", "two", "three", "four", "five");
        String stream = strings.stream().collect(Collectors.joining(","));
        System.out.println(stream);
    }
}
