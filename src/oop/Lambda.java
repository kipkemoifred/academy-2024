package oop;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Lambda {
    interface StringFunction {
        String run(String str);
    }

    @FunctionalInterface
    interface MyFunctionalInterface {
        void execute();  // Abstract method
    }


    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach( (n) -> { System.out.println(n); } );

        System.out.println("============================");

        ArrayList<Integer> numbers2 = new ArrayList<Integer>();
        numbers2.add(57);
        numbers2.add(9);
        numbers2.add(8);
        numbers2.add(1);
        Consumer<Integer> method = (n) -> { System.out.println(n); };
        numbers2.forEach( method );
        System.out.println("============================");

        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);

        MyFunctionalInterface func = () -> System.out.println("Executing...");
        func.execute();  // Output: Executing...
    }
    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }
}

