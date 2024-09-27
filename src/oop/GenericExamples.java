package oop;

import java.util.List;

public class GenericExamples {
    public static void main(String[] args) {
        // Create a Box for Integer
        Box<Integer> integerBox = new Box<>();
        integerBox.set(123);
        System.out.println(integerBox.get());  // Output: 123

        // Create a Box for String
        Box<String> stringBox = new Box<>();
        stringBox.set("Hello");
        System.out.println(stringBox.get());  // Output: Hello

        // Call the generic method with different types of arrays
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"A", "B", "C"};

        printArray(intArray);  // Output: 1 2 3 4 5
        printArray(strArray);  // Output: A B C

        NumberBox<Integer> integerBox1 = new NumberBox<>(123);
        integerBox1.printValue();  // Output: Value: 123

        NumberBox<Double> doubleBox = new NumberBox<>(3.14);
        doubleBox.printValue();  // Output: Value: 3.14

        Container<String> container = new StringContainer();
        container.add("Hello, World!");
        System.out.println(container.get());  // Output: Hello, World!

//         NumberBox<String> stringBox = new NumberBox<>("Hello"); // Compilation error: String is not a subtype of Number

        List<Integer> intList = List.of(1, 2, 3);
        List<String> strList = List.of("A", "B", "C");

        printList(intList);  // Output: 1 2 3
        printList(strList);  // Output: A B C

        List<Integer> intList1 = List.of(1, 2, 3);
        List<Double> doubleList = List.of(1.1, 2.2, 3.3);


        printNumbers(intList1);   // Output: 1 2 3
        printNumbers(doubleList);  // Output: 1.1 2.2 3.3
    }

    // Accepts any list of numbers or a subtype of Number
    public static void printNumbers(List<? extends Number> list) {
        for (Number num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void printList(List<?> list) {
        for (Object item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    // Define a generic method with a type parameter T
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

}
// Define a generic class with a type parameter T
class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}

// Define a generic class with a bounded type parameter
class NumberBox<T extends Number> {
    private T value;

    public NumberBox(T value) {
        this.value = value;
    }

    public void printValue() {
        System.out.println("Value: " + value);
    }
}

// Define a generic interface
interface Container<T> {
    void add(T item);
    T get();
}

// Implement a generic interface
class StringContainer implements Container<String> {
    private String item;

    @Override
    public void add(String item) {
        this.item = item;
    }

    @Override
    public String get() {
        return item;
    }
}