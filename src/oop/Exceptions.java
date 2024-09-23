package oop;

public class Exceptions {
    /*
    * The try statement allows you to define a block of code to be tested for errors while it is being executed.

The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.*/
    public static void main(String[] args) {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
            e.printStackTrace();
        }
        //The finally statement lets you execute code, after try...catch, regardless of the result:
        finally {
            System.out.println("The 'try catch' is finished.");
        }
        checkAge(12);
    }
    static void checkAge(int age) {
        if (age < 18) {
            //The throw statement allows you to create a custom error.
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        }
        else {
            System.out.println("Access granted - You are old enough!");
        }
    }
}
