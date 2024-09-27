package fundermentals;

import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {
        // Create an Optional
        Optional<String> optional = Optional.ofNullable("Hello");//"Hello"

        // Check if value is present
        optional.ifPresent(value -> System.out.println("Value: " + value));

        // Use map() to transform value
        Optional<String> upperCaseOptional = optional.map(String::toUpperCase);
        upperCaseOptional.ifPresent(System.out::println);  // Output: HELLO

        // Use filter() to filter value
        Optional<String> filteredOptional = optional.filter(value -> value.startsWith("H"));
        filteredOptional.ifPresent(System.out::println);  // Output: Hello

        // Get the value or provide a default
        String defaultValue = optional.orElse("Default");
        System.out.println("Optional value or default: " + defaultValue);

        // Use orElseThrow() to throw an exception if value is not present
        String value = optional.orElseThrow(() -> new IllegalStateException("Value not found"));
        System.out.println("Value: " + value);
    }
}
