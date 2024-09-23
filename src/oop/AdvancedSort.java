package oop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
* The Comparable interface allows an object to specify its own sorting rule with a compareTo() method.

The compareTo() method takes an object as an argument and compares the comparable with the argument to decide which one should go first in a list.

Like the comparator, the compareTo() method returns a number which is:

    Negative if the comparable should go first in a list.
    Positive if the other object should go first in a list.
    Zero if the order does not matter.
*/
public class AdvancedSort {
    public static void main(String[] args) {
        // Create a list of cars
        ArrayList<Car1> myCars = new ArrayList<Car1>();
        myCars.add(new Car1("BMW", "X5", 1999));
        myCars.add(new Car1("Honda", "Accord", 2006));
        myCars.add(new Car1("Ford", "Mustang", 1970));

        // Use a comparator to sort the cars
        Comparator myComparator = new SortByYear();
        Collections.sort(myCars, myComparator);

    /*    Collections.sort(myCars, (obj1, obj2) -> {
            Car1 a = (Car1) obj1;
            Car1 b = (Car1) obj2;
            if (a.year < b.year) return -1;
            if (a.year > b.year) return 1;
            return 0;
        });
*/
        // Display the cars
        for (Car1 c : myCars) {
            System.out.println(c.brand + " " + c.model + " " + c.year);
        }

        System.out.println("=============================================================");
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(33);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(34);
        myNumbers.add(8);
        myNumbers.add(12);

        Comparator myComparator1 = new SortEvenFirst();
        Collections.sort(myNumbers, myComparator1);

        for (int i : myNumbers) {
            System.out.println(i);
        }



    }
}


// Sort Car objects by year
class SortByYear implements Comparator {
    public int compare(Object obj1, Object obj2) {
        // Make sure that the objects are Car objects
        Car1 a = (Car1) obj1;
        Car1 b = (Car1) obj2;

        // Compare the objects
        if (a.year < b.year) return -1; // The first car has a smaller year
        if (a.year > b.year) return 1;  // The first car has a larger year
        return 0; // Both cars have the same year
    }
}

// Define a Car class
class Car1 {
    public String brand;
    public String model;
    public int year;

    public Car1(String b, String m, int y) {
        brand = b;
        model = m;
        year = y;
    }
}

class SortEvenFirst implements Comparator {
    public int compare(Object obj1, Object obj2) {
        // Make sure the objects are integers
        Integer a = (Integer)obj1;
        Integer b = (Integer)obj2;

        // Check each number to see if it is even
        // A number is even if the remainder when dividing by 2 is 0
        boolean aIsEven = (a % 2) == 0;
        boolean bIsEven = (b % 2) == 0;

        if (aIsEven == bIsEven) {

            // If both numbers are even or both are odd then use normal sorting rules
            if (a < b) return -1;
            if (a > b) return 1;
            return 0;

        } else {

            // If a is even then it goes first, otherwise b goes first
            if (aIsEven) {
                return -1;
            } else {
                return 1;
            }
        }
    }
    /*
    The Comparable interface allows an object to specify its own sorting rule with a compareTo() method.

The compareTo() method takes an object as an argument and compares the comparable with the argument to decide which one should go first in a list.

Like the comparator, the compareTo() method returns a number which is:

    Negative if the comparable should go first in a list.
    Positive if the other object should go first in a list.
    Zero if the order does not matter.

    * */






}

class Car3 implements Comparable {
    public String brand;
    public String model;
    public int year;

    // Decide how this object compares to other objects
    public int compareTo(Object obj) {
        Car3 other = (Car3)obj;
        if(year < other.year) return -1; // This object is smaller than the other one
        if(year > other.year) return 1;  // This object is larger than the other one
        return 0; // Both objects are the same
    }
}

// Define a Car class which is comparable
class Car4 implements Comparable {
    public String brand;
    public String model;
    public int year;

    public Car4(String b, String m, int y) {
        brand = b;
        model = m;
        year = y;
    }

    // Decide how this object compares to other objects
    public int compareTo(Object obj) {
        Car4 other = (Car4)obj;
        if(year < other.year) return -1; // This object is smaller than the other one
        if(year > other.year) return 1;  // This object is larger than the other one
        return 0; // Both objects are the same
    }
}

 class Main2 {
    public static void main(String[] args) {
        // Create a list of cars
        ArrayList<Car4> myCars = new ArrayList<Car4>();
        myCars.add(new Car4("BMW", "X5", 1999));
        myCars.add(new Car4("Honda", "Accord", 2006));
        myCars.add(new Car4("Ford", "Mustang", 1970));

        // Sort the cars
        Collections.sort(myCars);

        // Display the cars
        for (Car4 c : myCars) {
            System.out.println(c.brand + " " + c.model + " " + c.year);
        }
    }
    /*
    A comparator is an object with one method that is used to compare two different objects.

A comparable is an object which can compare itself with other objects.
    * */
}



