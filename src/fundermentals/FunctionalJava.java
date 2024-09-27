package fundermentals;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class FunctionalJava {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Jack", "Diana");


        // Create a stream, filter names that start with 'J', convert to uppercase, and print
        names.stream()
                .filter(name -> name.startsWith("J"))
                .map(String::toUpperCase)
                .forEach(System.out::println);  // Output: JOHN, JANE, JACK


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        numbers.stream()
                .filter(n -> n % 2 == 0)  // Filters even numbers
                .forEach(System.out::println);  // Output: 2, 4, 6


        List<String> names1 = Arrays.asList("John", "Jane", "Jack");
        names1.stream()
                .map(String::toUpperCase)  // Converts each name to uppercase
                .forEach(System.out::println);  // Output: JOHN, JANE, JACK

        List<Integer> numbers1 = Arrays.asList(5, 1, 4, 3, 2);
        numbers1.stream()
                .sorted()  // Natural sorting
                .forEach(System.out::println);  // Output: 1, 2, 3, 4, 5


        List<Integer> numbers2 = Arrays.asList(1, 2, 2, 3, 3, 4);
        numbers2.stream()
                .distinct()  // Removes duplicates
                .forEach(System.out::println);  // Output: 1, 2, 3, 4


        List<Integer> numbers3 = Arrays.asList(1, 2, 3, 4);
        List<Integer> evenNumbers = numbers3.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(evenNumbers);  // Output: [2, 4]

        List<Integer> numbers4 = Arrays.asList(1, 2, 3, 4);
        int sum = numbers4.stream()
                .reduce(0, (a, b) -> a + b);  // Sum of elements

        System.out.println(sum);  // Output: 10



        List<String> names2 = Arrays.asList("John", "Jane", "Jack");
        names2.stream()
                .forEach(System.out::println);  // Output: John, Jane, Jack


    }
}
