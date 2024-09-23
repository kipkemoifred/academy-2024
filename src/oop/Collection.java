package oop;

import java.util.*;

public class Collection {
    public static void main(String[] args) {
        /*
        * The ArrayList class is a resizable array, which can be found in the java.util package.
The difference between a built-in array and an ArrayList in Java, is that the size of an array
*  cannot be modified (if you want to add or remove elements to/from an array, you have to create a new one).
* While elements can be added and removed from an ArrayList whenever you want. The syntax is also slightly different:*/

        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(33);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(34);
        myNumbers.add(8);
        myNumbers.add(12);

//        Collections.sort(myNumbers);  // Sort myNumbers
        Collections.sort(myNumbers, Collections.reverseOrder());

        for (int i : myNumbers) {
            System.out.println(i);
        }

        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        // Create a HashMap object called people
        HashMap<String, Integer> people = new HashMap<String, Integer>();

        // Add keys and values (Name, Age)
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);

        for (String i : people.keySet()) {
            System.out.println("key: " + i + " value: " + people.get(i));
        }


        // Create a HashSet object called numbers
        HashSet<Integer> numbers = new HashSet<Integer>();

        // Add values to the set
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);

        // Show which numbers between 1 and 10 are in the set
        for(int i = 1; i <= 10; i++) {
            if(numbers.contains(i)) {
                System.out.println(i + " was found in the set.");
            } else {
                System.out.println(i + " was not found in the set.");
            }
        }

        ArrayList<Integer> numbers1 = new ArrayList<Integer>();
        numbers1.add(12);
        numbers1.add(8);
        numbers1.add(2);
        numbers1.add(23);
        Iterator<Integer> it = numbers1.iterator();
        while(it.hasNext()) {
            Integer i = it.next();
            if(i < 10) {
                it.remove();
            }
        }
        System.out.println(numbers1);
    }

}
