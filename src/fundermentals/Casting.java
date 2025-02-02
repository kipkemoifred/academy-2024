package fundermentals;

public class Casting {
    public static void main(String[] args) {
        //Narrowing Casting
        double myDouble = 9.78d;
        int myInt = (int) myDouble; // Manual casting: double to int

        System.out.println(myDouble);   // Outputs 9.78
        System.out.println(myInt);      // Outputs 9


//        Widening Casting

        int myInt1 = 9;
        double myDouble1 = myInt; // Automatic casting: int to double

        System.out.println(myInt1);      // Outputs 9
        System.out.println(myDouble1);   // Outputs 9.0
    }
}
